package com.journaldev.inheritance;

package SecondClass;

public class Mobile {

	public static void main(String[] args) {
		class Mobile{
			void giveCall(){
		//some code
			}
			void playGame(){
				//some code
			}
		}
		class Person //extends Mobile
		{
			Mobile m = new Mobile(); //So we can tell person has a Mobile 
		void eatFood(){
				//some code
			}
			void drinkWater(){
				//some code
			}
		}
		public class Test{
			public static void main(String[] args){
		Person p = new Person();
		 		p.m.giveCall(); //Person has a mobile so accessing it using person object 
				p.m.playGame(); //Person has a mobile so accessing it using person object
		}
		}


	}

}
