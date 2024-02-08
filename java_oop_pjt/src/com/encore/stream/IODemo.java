package com.encore.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.encore.hms.domain.StudentDTO;
import com.encore.hms.domain.sup.Person;

public class IODemo {
	
	public IODemo() {
	}

	public String inputStr() throws IOException { // 간접적인 예외 처리 중 하나
		// System.in.read(); // in이 인풋스트림이다 그래서 read를 불러올 수 있다. but 아스키 코드로 들어옴.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input Message : ");
		
		String data = reader.readLine();
		return data;
	}
	
	public int inputInt() { 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input Message : ");
		
		int data = 0;
	    try {
	    	data = Integer.parseInt(reader.readLine()); // 문자열을 정수로 변환해준다.
	    
	    } catch (NumberFormatException e) {
	    	e.printStackTrace();
	    } catch (IOException e) {
	    	e.printStackTrace();
	    }
	    
		return data;
		
	}
	
	public void first(int flag) throws EncoreException {
		System.out.println(">>> first start ");
		try {
			second(flag);
		} finally {
			System.out.println(">>> first end ");
		}
	}
	
	public void second(int flag) throws EncoreException {
		System.out.println(">>> second start ");
		try {
			third(flag);
		} finally {
			System.out.println(">>> second end ");
		}
	}
	
	public void third(int flag) throws EncoreException {
		System.out.println(">>> third start ");
		try {
			if(flag == 0) {
				throw new EncoreException("사용자 정의 예외 발생"); // 객체 생성
			}
		} finally {
			System.out.println(">>> third end ");
		}
	}
	
	//파일 출력 기능
	public boolean outputFile() {
	    boolean flag = false;
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Input : ");
	    String msg = scan.nextLine(); //공백 포함 문자열 nextline()
	    
	    //콘솔에서 입력한 데이터를 파일로 저장
	    File file = new File("C:\\file/testWriter.txt");
	    FileWriter writer = null;
	    BufferedWriter bw = null;
	    try {
	        writer = new FileWriter(file);
	        bw = new BufferedWriter(writer);
	        bw.write(msg);
	        flag = true;
	    } catch (Exception e) {
	        throw new RuntimeException(e);
	    } finally {
	        try {
	        	if(bw != null) {bw.close();} // 값이 있을 때만 close 한다는 뜻
	        } catch (IOException e) {
	            throw new RuntimeException(e);
	        }
	    }
	    return flag;
	}
	
	//객체가 가지고 있는 정보를 파일에 저장
	public boolean outputObjFile() {
	    boolean flag = false;
	    
	    Person [] perAry = new Person[10];
	    int idx = 0;
	    perAry[idx++] = new StudentDTO("강찬미", 20, "서울", "2020");
	    perAry[idx++] = new StudentDTO("강찬미", 20, "서울", "2020");
	    perAry[idx++] = new StudentDTO("강찬미", 20, "서울", "2020");
	    
	    
	    File file = new File("C:\\file/testWriter.txt");
	    FileWriter writer = null;
	    BufferedWriter bw = null;
	    try {
	        writer = new FileWriter(file);
	        bw = new BufferedWriter(writer);
	        for(int i = 0 ; i < perAry.length ; i++) {
	        	if(perAry[i] != null) {
	        	bw.write(perAry[i].getName() + perAry[i].getAge() + ":" + perAry[i].getAddress() + ((StudentDTO)perAry[i]).getStuId());
	        	bw.newLine();
	        }
	    }
	        
	        flag = true;
	    } catch (Exception e) {
	        throw new RuntimeException(e);
	    } finally {
	        try {
	        	if(bw != null) {bw.close();} // 값이 있을 때만 close 한다는 뜻
	        } catch (IOException e) {
	            throw new RuntimeException(e);
	        }
	    }
	    return flag;
	}
	
	public void outputSerializable() {
		// String msg = "난 직렬화된 객체여서 바이너리 형태로 저장이 가능함.";
		// StudentDTO stu = new StudentDTO("강찬미", 20 , "강북구", "2020");
		
		Person [] perAry = new Person[10];
	    int idx = 0;
	    perAry[idx++] = new StudentDTO("강찬미", 20, "서울", "2020");
	    perAry[idx++] = new StudentDTO("강찬미", 20, "서울", "2020");
	    perAry[idx++] = new StudentDTO("강찬미", 20, "서울", "2020");
	    
		FileOutputStream fis = null;
		ObjectOutputStream oos = null;
		try {
			fis = new FileOutputStream("c:\\file/serial.txt");
			oos = new ObjectOutputStream(fis);
			
			oos.writeObject(perAry);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(oos != null) {oos.close();}
			} catch (Exception e){
				e.printStackTrace();
			}
		}
	}
	public void inputSerializable() {
		String msg = null;
		FileInputStream fis = null;
		ObjectInputStream oos = null;
		try {
			fis = new FileInputStream("c:\\file/serial.txt");
			oos = new ObjectInputStream(fis);
			// msg = (String)(oos.readObject());
			// StudentDTO stu  = (StudentDTO)(oos.readObject());
			// System.out.println(stu.personInfo());
			
			Person [] perAry = ( Person [] )(oos.readObject());
			for(int i = 0 ; i < perAry.length; i++) {
	        	if(perAry[i] != null) {
	        		System.out.println(perAry[i].personInfo());
	        	}
	        }
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(oos != null) {oos.close();}
			} catch (Exception e){
				e.printStackTrace();
			}
		}
	}

	
	
}
