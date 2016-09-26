package ex;
import java.util.*;
/*
 * Topic: 假設某個停車場的費率是停車2小時以內，每半小時30元，超過2小時，但未滿4小時的部份，
 * 	每半小時40元，超過4小時以上的部份，每半小時60元，未滿半小時部分不計費。
 * 	如果您從早上10點23分停到下午3點20分，請撰寫程式計算共需繳交的停車費。
 * Date: 2016/09/26
 * Author: 105021032 鄭權豪
 */

public class ex03_105021032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sca=new Scanner(System.in);
        int a=sca.nextInt();
        int b=sca.nextInt();
        int c=sca.nextInt();
        int d=sca.nextInt();
        int e=sca.nextInt();
	int e=(c*60+d)-(a*60-b)/30;
        int o=0;
        if(e<=4){o=e*30;
        
        }
        else if(8<e && e<4){o=120+(e-4)*40;
	}
        else{o=120+160+(e-8*60);
        }
        System.out.print(o);
	}
}
 
