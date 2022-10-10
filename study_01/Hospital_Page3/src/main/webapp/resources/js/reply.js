var replyService = (function() {

  function add(reply, callback, error) {
    console.log("reply add.....")

    $.ajax({
      type : 'post',
      url : '/replies/new',
      data : JSON.stringify(reply),
      contentType : "application/json; charset=utf-8",
      success : function(result, status, xhr) {
        if (callback) { // status : 상태정보, xhr : 통신객체정보(비동기데이타 전송요청)
          callback(result);
        }
      },
      error : function(xhr, status, err) {
        if (error) {
          error(err);
        }
      }
    })
  }
  function getList(param, callback, error) {
    var bno = param.bno;
    $.getJSON("/replies/" + bno + ".json",
      function(data) {
        if (callback) {
         callback(data);
        }
      }).fail(function(xhr, status, err) {
      if (error) {
      	console.log("에러");
        error(err);
      }
    });
  } // end for getList
  
    function remove(rno, callback, error) {
    $.ajax({
      type : 'delete',
      url : '/replies/' + rno,
      success : function(deleteResult, status, xhr) {
        if (callback) callback(deleteResult);
      },
      error : function(xhr, status, err) {
        if (error) error(err);
      }
    })
  } // end for delete

  function update(reply, callback, error) {
    console.log("update..........");
    $.ajax({
      type : 'put',
      url : '/replies/' + reply.rno,
      data : JSON.stringify(reply),
      contentType : "application/json; charset=utf-8",
      success : function(result, status, xhr) {
        if (callback) {
          callback(result);
        }
      },
      error : function(xhr, status, err) {
        if (error) {
          error(err);
        }
      }
    });
  }// end for update
  
  function get(rno, callback, error) {
    console.log("get.........");
    $.ajax({
      type : 'get',
      url : '/replies/get/' + rno,
      success : function(result, status, xhr) {
        if (callback) { // status : 상태정보, xhr : 통신객체정보(비동기데이타 전송요청)
          callback(result);
        }
      },
      error : function(xhr, status, err) {
        if (error) {
          error(err);
        }
      }
    });
  }; // end for get
  
    function displayTime(timeValue) {
    var today = new Date();
    var gap = today.getTime() - timeValue;
    var dateObj = new Date(timeValue);
    var str = "";

    if (gap < 60 * 60 * 24 * 1000) {
      var hh = dateObj.getHours();
      var mi = dateObj.getMinutes();
      var ss = dateObj.getSeconds();

      return [(hh > 9 ? '' : '0') + hh, ':', (mi > 9 ? '' : '0') + mi, ':', (ss > 9 ? '' : '0') + ss].join('');
    } else {
      var yy = dateObj.getFullYear();
      var mm = dateObj.getMonth();
      var dd = dateObj.getDay();

      return [yy, '/', (mm > 9 ? '' : '0') + mm, '/', (dd > 9 ? '' : '0') + dd].join('');
    }
  } // end for displayTime
  
  return {
    add:add,
    getList:getList,
    remove:remove,
    update:update,
    get:get,
    displayTime:displayTime
  }; // 함수를 객체로 만들어서 리턴
})();