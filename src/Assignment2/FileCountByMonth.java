package Assignment2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class FileCountByMonth{

	public static void main(String[] args) throws IOException{
		System.out.println("Example output of the program");
		System.out.println("Provide the path of the folder:\r\n" + 
				"C:\\Users\\Public\\BlueStacks\r\n" + 
				"Total files=2\r\n" + 
				"Count by creation date by month\r\n" + 
				"Jan=0\r\n" + 
				"Feb=0\r\n" + 
				"Mar=0\r\n" + 
				"Apr=0\r\n" + 
				"May=2\r\n" + 
				"Jun=0\r\n" + 
				"Jul=0\r\n" + 
				"Aug=0\r\n" + 
				"Sept=0\r\n" + 
				"Oct=0\r\n" + 
				"Nov=0\r\n" + 
				"Dec=0");
		Scanner sc=new Scanner(System.in);
		System.out.println("Provide the path of the folder:");
		String loc=sc.nextLine();
		File path=new File(loc);
		File f[]=path.listFiles();
		System.out.println("Total files="+f.length);
		int Jan=0,Feb=0,Mar=0,Apr=0,May=0,Jun=0,Jul=0,Aug=0,Sept=0,Oct=0,Nov=0,Dec=0;
		for(int i=0;i<f.length;i++)
		{
			BasicFileAttributes att=Files.readAttributes(f[i].toPath(), BasicFileAttributes.class);
			Date x=new Date(att.creationTime().to(TimeUnit.MILLISECONDS));
			int m=x.getMonth()+1;
			switch(m)
			{
			case 1:
				Jan++;
				break;
			case 2:
				Feb++;
				break;
			case 3:
				Mar++;
				break;
			case 4:
				Apr++;
				break;
			case 5:
				May++;
				break;
			case 6:
				Jun++;
				break;
			case 7:
				Jul++;
				break;
			case 8:
				Aug++;
				break;
			case 9:
				Sept++;
				break;
			case 10:
				Oct++;
				break;
			case 11:
				Nov++;
				break;
			case 12:
				Dec++;
				break;	
	}
	}
System.out.println("Count of files grouped by created date month"+"\nJan="+Jan+"\nFeb="+Feb+"\nMar="+Mar+"\nApr="+Apr+"\nMay="+May+"\nJun="+Jun+"\nJul="+Jul+"\nAug="+Aug+"\nSept="+Sept+"\nOct="+Oct+"\nNov="+Nov+"\nDec="+Dec);
}

}


