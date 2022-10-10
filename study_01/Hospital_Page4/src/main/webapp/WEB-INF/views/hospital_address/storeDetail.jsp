<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="//dapi.kakao.com/v2/maps/sdk.js?appkey=앱키&libraries=services,clusterer,drawing"></script>

</head>
<body>
<li>
    <div>
        <h2>찾아 오시는 길</h2>
        
        <div id="map_box">
            <div id="map"></div>
            
            <div id="position_box">
                <button class="storePosition" ><i class="far fa-dot-circle"></i> 가게 위치로</button>
                <button class="userPosition"> <i class="far fa-dot-circle"></i> 내 위치로</button>
            </div>
        </div>
        
        <h2>위치안내</h2>
        <div id="store_address" data-address="${info.storeAddress2 }">${info.storeAddress2 }  ${info.storeAddress3 }</div>
    </div>
</li>
 
<li>
    <div>
       <h2>가게 소개</h2>
       <div>${info.storeDes }</div>
   </div>
</li>
 
<li>
    <div>
        <h2>영업 정보</h2>
        
        <div class="info_detail_title">
            <div>상호명</div>
            <div>영업시간</div>
            <div>전화번호</div>
            
        </div>
        
        <div class="info_detail">
            <div>${info.storeName }</div>
            <div>
                <span><fm:formatNumber value="${info.openingTime }" minIntegerDigits="2" />시 ~</span>
                <span><fm:formatNumber value="${info.closingTime }" minIntegerDigits="2" />시 </span>
            </div>
            <div>${info.storePhone }</div>
            
        </div>
    </div>
</li>
 
<li>
    <div>
        <h2>가계 통계</h2>
        <div class="info_detail_title">
            <div>최근 주문수</div>
            <div>전체 리뷰 수</div>
            <div>찜</div>
        </div>
        
        <div class="info_detail">
            <%-- 
            <div>${info.orderCount }</div>
            <div>${info.reviewCount }</div>
            <div>${info.likesCount }</div> 
            --%>
        </div>
    </div>	
</li>
</body>

<script>
    $(document).ready(function(){
    	
		var storeAddress = $("#store_address").data("address");
        
    	var storeName = $("#store_name").data("store_name");
    	
    	var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
    	
    	mapOption = {
    	    center: new kakao.maps.LatLng(33.25110701, 126.570667), // 지도의 중심좌표
    	    level: 3 // 지도의 확대 레벨
    	};  
    	
    	// 지도를 생성합니다    
    	var map = new kakao.maps.Map(mapContainer, mapOption); 
    	
    	// 주소-좌표 변환 객체를 생성합니다	
    	var geocoder = new kakao.maps.services.Geocoder();
    	
    	// 주소로 좌표를 검색합니다
    	geocoder.addressSearch(storeAddress, function(result, status) {
    		
    	    // 정상적으로 검색이 완료됐으면 
    	     if (status === kakao.maps.services.Status.OK) {
    	
    	        var coords = new kakao.maps.LatLng(result[0].y, result[0].x);
    	        
    	        // 결과값으로 받은 위치를 마커로 표시합니다
    	        var marker = new kakao.maps.Marker({
    	            map: map,
    	            position: coords
    	        });
    	
    	        // 인포윈도우로 장소에 대한 설명을 표시합니다
    	        var infowindow = new kakao.maps.InfoWindow({
    	            content: '<div style="width:150px;text-align:center;padding:3px 0;">' + storeName + '</div>'
    	        });
    	        infowindow.open(map, marker);
    	
    	        // 지도의 중심을 결과값으로 받은 위치로 이동시킵니다
    	        map.setCenter(coords);
    	        
    	        
    	        $(".storePosition").click(function(){
    	        	map.panTo(coords);  
    	        })
    	        
    	        
    	    } 
    			 
    	});    
    	
    	
    	var userAddress = $("#delevery_address").val();
    	
    	if(userAddress != "" ) {
    		$(".userPosition").css("display" , "inline");
    		
    	  // 주소로 좌표를 검색합니다
    	 	geocoder.addressSearch(userAddress, function(result, status) {
    	 		
    	 	    // 정상적으로 검색이 완료됐으면 
    	 	     if (status === kakao.maps.services.Status.OK) {
    	 	
    	 	        coords = new kakao.maps.LatLng(result[0].y, result[0].x);
    	 	        
    	 	        // 결과값으로 받은 위치를 마커로 표시합니다
    	 	        var marker = new kakao.maps.Marker({
    	 	            map: map,
    	 	            position: coords
    	 	        });
    	 	        
    	 	        // 인포윈도우로 장소에 대한 설명을 표시합니다
    	 	        var infowindow = new kakao.maps.InfoWindow({
    	 	            content: '<div style="width:150px;text-align:center;padding:3px 0;">' + "배달받을위치" + '</div>'
    	 	        });
    	 	        infowindow.open(map, marker);
    	 	        
    	 	      	$(".userPosition").click(function(){
    		        	map.panTo(coords);  
    		        })
    	 	    } 
    	 	}); 
    		 
    	}
    	
        })
	</script>
