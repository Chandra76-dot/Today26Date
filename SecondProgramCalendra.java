public static void main(String[] args) {
		
		//create a default calendar
		
		Calendar cal = Calendar.getInstance();
		System.out.println();
		System.out.println("\nCurrent Date and Time:" + cal.getTime());
		int actualMaxYear = cal.getActualMinimum(Calendar.YEAR);
		int actualMaxMonth = cal.getActualMinimum(Calendar.MONTH);
		int actualMaxWeek = cal.getActualMinimum(Calendar.WEEK_OF_YEAR);
		int actualMaxDate = cal.getActualMinimum(Calendar.DATE);
		
		
		System.out.println("Actual Minimum Year:"+actualMaxYear);
		System.out.println("Actual Minimum Month:"+actualMaxMonth);
		System.out.println("Actual Minimum week of year:"+actualMaxWeek);
		System.out.println("Acutal Minimum Date:"+actualMaxDate+"\n");
	}


	}
