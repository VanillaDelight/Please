package Exercise;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ex01 {
   
   static ArrayList<Student> record = new ArrayList<>();
   static Scanner s = new Scanner(System.in);
   
   
   public static void main(String[] args) {
     
      while(true) {
         switch (displaymenu()) {
         case 1:
            inputrecord();
            break;

         case 2:
            displayrecord();
            break;
         case 3:
            System.out.println("프로그램 종료");
            System.exit(0);
         }
      }
   }
   static int displaymenu() {
      System.out.println("***********************************************");
      System.out.println("                    성적관리 프로그램               ");
      System.out.println("***********************************************");
      System.out.println();
      System.out.println("1.학생성적 입력하기");
      System.out.println("2.학생성적보기");
      System.out.println("3.프로그램 종료");
      System.out.println("원하는 메뉴를 선택하시오~ (1~3)");
      
      int menu=0;
      
      while(true) {
         menu=s.nextInt();
         if(menu==1) {
            inputrecord();
         }else if(menu==2) {
            displayrecord();
         }else if(menu==3) {
            break;
         }else {
            System.out.println("다시 입력하시오");
         }
         
      }
      
      
      return menu;
   }
   static void inputrecord() {
      System.out.println("1.학생성적 입력하기");
      System.out.println("이름,반,번호,국어성적,영어성적,의 순서로 공백없이 입력하세요");
      System.out.println("입력을 마치리면 q를 입력하세요. 메인화면으로 돌아갑니다");
      
      
      int i=0;
      String a;
      while(true) {
         System.out.print(">>");
         a=s.next();
     
         try {
            if(a.equalsIgnoreCase("Q")) {
               displaymenu();
               System.out.println("입력부분 나갑니다.");     break;
            }
            
            StringTokenizer st = new StringTokenizer(a,",");
         
            String b=" ";
            
            int q,w=0,e=0,r=0,t=0;
            
            b = st.nextToken();
            q = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());
            e = Integer.parseInt(st.nextToken());
            r = Integer.parseInt(st.nextToken());
            t = Integer.parseInt(st.nextToken());
            
            record.add(new Student(b, q, w, e, r, t));
         
         }catch(Exception e){
            System.out.println("다시 입력하세요");
         }
      }
      
   }
   static void displayrecord() {
      int koreantotal=0;
      int englishtotal=0;
      int mathtotal=0;
      int total=0;
      
      int length=record.size();
      if(length>0){
         System.out.println();
         System.out.println("이름 반 번호 국어 영어 수학 총점 평균 전교등수 반등수");
      
      System.out.println("============================================");
      for(int i=0; i<length; i++) {
         Student student= record.get(i);
         System.out.println(student);
         koreantotal+= student.kor;
         mathtotal+=student.math;
         englishtotal+=student.eng;
         total+=student.total;
      }
      System.out.println("==========================================");
      System.out.println("총점"+koreantotal+" "+englishtotal+" "+mathtotal+" "+total);
      System.out.println();
      }else {
         System.out.println("======================================");
         System.out.println("데이터가 없습니다");
         System.out.println("======================================");
      }
   }

}
class Student implements Comparable{
   
   String name;
   int ban;
   int no;
   int kor;
   int eng;
   int math;
   int total;
   int schoolrank;
   int classrank;
   
   Student(String name, int ban, int no, int kor, int eng,int math){
      this.name=name;
      this.ban=ban;
      this.no=no;
      this.kor=kor;
      this.eng=eng;
      this.math=math;
      
      total=kor+eng+math;
   }
   int getTotal() {
      return total;
   }
   float getAverge() {
      return (int)((getTotal()/3f)*10+0.5)/10f;
   }
   public int compareTo(Object o) {
      if(o instanceof Student) {
         Student tmp = (Student)o;
         return tmp.total-this.total;
      }else {
         return -1;
      }
   }
   public String toString() {
      return name
            +","+ban+","+no+","+","+kor+","+","+eng+","+","+math+","+getTotal()+","+getAverge()+","+schoolrank+","+classrank;
   }
}