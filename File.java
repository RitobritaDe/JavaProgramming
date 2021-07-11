import java.io.*;

import java.io.DataOutputStream.*;

public class File
{
  
	public static void main(String args[]) throws Exception
  
	{
    
		FileOutputStream fos=new FileOutputStream("test.txt");
    
		DataOutputStream dos=new DataOutputStream(fos);
    
		dos.writeInt(25); 
    
		dos.writeBoolean(true);
    
		dos.writeChar('A');
    
		dos.writeDouble(5.45);
    
		dos.flush();
    
		dos.close();
    
		FileInputStream fis=new FileInputStream("test.txt");
    
		DataInputStream dis=new DataInputStream(fis);
    
		int a=dis.readInt(); 
    
		boolean b=dis.readBoolean();
    
		char c=dis.readChar();
    
		double d=dis.readDouble(); 
    
		dis.close();
    
		System.out.println("Values"+"\n"+a+"\n"+b+"\n"+c+"\n"+d);
  
	}

}