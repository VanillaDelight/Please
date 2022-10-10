package org.hospital.crawling;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HospitalCrawl {
	public static void main(String[] args) throws IOException {
		String url = "https://www.google.com/search?q=%EB%B3%91%EC%9B%90&hl=ko&cs=0&biw=1280&bih=609&tbm=lcl&sxsrf=ALiCzsYBIkCNwlQCss5tCtAj9UdA7SHYYg%3A1660153636752&ei=JO_zYti4LbPEmAXN8Ye4Ag&oq=%EB%B3%91%EC%9B%90&gs_l=psy-ab.3..35i39k1l2j0i67k1l4j0i512k1l4.12584.13371.0.13540.7.7.0.0.0.0.141.521.0j4.4.0....0...1c.1j4.64.psy-ab..3.4.520...0i512i433i131k1j0i3k1j0i512i263i20k1j0i512i433k1j0i512i263i433i131i20k1.0.kg-ZR8aBwtM#rlfi=hd:;si:;mv:[[37.501374,127.0404704],[37.4844167,127.0161228]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!1m4!1u2!2m2!2m1!1e1!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2";
	 	Document doc = Jsoup.connect(url).get();
	 	Elements elements = doc.getElementsByAttributeValue("class", "rlfl__tls rl_tls");
	 	Element element = elements.get(0);
	 	Elements detailsElements = element.getElementsByAttributeValue("class", "rllt__details");
	 	
		/* System.out.println(OSrXXbElements.size()); */
		/* System.out.println(elements); */
//		 System.out.println(OSrXXbElements); 
//	 
//	 	System.out.println(detailsElements);
//
//		 System.out.println(detailsElements);
//		
		  for(int i=0; i<detailsElements.size(); i++) { 
			 Element articleElement = detailsElements.get(i); 
			 Elements addressElements = articleElement.select("div");
			 Element addressElement = addressElements.get(0);
			 System.out.println(addressElement.text());
			 System.out.println();
			 
//			 Elements aElements = articleElement.select("span");
//			 Element aElement = aElements.get(0);
//			 System.out.println(aElement.text());
//			 String hospital = aElement.attr("class");
//			 System.out.println(hospital);
//			 Elements YDIN4cElements = element.getElementsByAttributeValue("class", "YDIN4c YrbPuc");
//			 Element YDIN4cElement = YDIN4cElements.get(0);
//			 System.out.println(YDIN4cElement.text());
//			 System.out.println();
		}
		 
	}
}
