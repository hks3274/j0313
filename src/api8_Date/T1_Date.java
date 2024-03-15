package api8_Date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class T1_Date {
	public static void main(String[] args) {
		//Date 객체
		Date now = new Date();
		System.out.println("1. 오늘의 날짜(기본형식) : " + now);
		
		//날짜객체를 문자화 : toString()
		String strNow = now.toString();
		System.out.println("2. 오늘의 날짜(문자형식) : " + strNow);
		System.out.println();
		
		//날짜 형식을 사용자 지정에 따라 변경 : SimpleDateFormat() => 클래스 이다
		//매개변수 : 년도(yy, yyyy), 월(M), 일(d), 시간(h,H(24시간제)), 분(m), 초(s)
		SimpleDateFormat sdf = new SimpleDateFormat();
		String strNow1 = sdf.format(now);
		System.out.println("기본 날짜 시간 포맷 : " + strNow1);
		
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		strNow1 = sdf.format(now);
		System.out.println("yyyy-MM-dd : " + strNow1);
		
		sdf = new SimpleDateFormat("MM/dd/yyyy");
		strNow1 = sdf.format(now);
		System.out.println("MM/dd/yyyy : " + strNow1);
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		strNow1 = sdf.format(now);
		System.out.println("yyyy년 MM월 dd일 : " + strNow1);
	
		sdf = new SimpleDateFormat("yy년 M월 dd일");
		strNow1 = sdf.format(now);
		System.out.println("yy년 M월 dd일 : " + strNow1);
		System.out.println();
		
		sdf = new SimpleDateFormat("hh:mm:ss");
		strNow1 = sdf.format(now);
		System.out.println("hh:mm:ss : " + strNow1);
		
		sdf = new SimpleDateFormat("h:m:s");
		strNow1 = sdf.format(now);
		System.out.println("h:m:s : " + strNow1);
		
		sdf = new SimpleDateFormat("HH:mm:ss");
		strNow1 = sdf.format(now);
		System.out.println("HH:mm:ss : " + strNow1);
	
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:m:s");
		strNow1 = sdf.format(now);
		System.out.println("yyyy-MM-dd HH:m:s : " + strNow1);
		System.out.println("오늘 날짜 : " + strNow1.substring(0,10));
		
		sdf = new SimpleDateFormat("yyyy.MM.dd HH:m:s");
		strNow1 = sdf.format(now);
		System.out.println("yyyy.MM.dd HH:m:s : " + strNow1);
	
	
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 m분 s초");
		strNow1 = sdf.format(now);
		System.out.println("yyyy년 MM월 dd일 HH시 m분 s초 : " + strNow1);
		System.out.println();
		
		//요일? = E 사용
		sdf = new SimpleDateFormat("오늘은 E요일");
		System.out.println(sdf.format(now));
	
		//올해의 D번째 날 => 1월 1일부터 계산
		sdf = new SimpleDateFormat("오늘은 올해의 D번째날");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("오늘은 이번달의 d번째날");
		System.out.println(sdf.format(now));
	
		
		sdf = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss", Locale.ENGLISH);
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss", Locale.ENGLISH);
		System.out.println(sdf.format(now));
	
	}
}
