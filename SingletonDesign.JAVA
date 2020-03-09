//CREATIONAL PATTERN

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.lang.System;


public class SingletonDesign{
public static void main(String[] args) {
SingleTon ton = SingleTon.getSingleTonObject();
System.out.println(ton.getProperties().get("name"));
System.out.println(ton.getProperties().get("blogname"));


ton.getProperties().setProperty("email", "some@gmail.com");
System.out.println(ton.getProperties().get("email"));

}


}
class SingleTon{
public static SingleTon singleTon=null;
public Properties properties=null;

public Properties getProperties() {
return properties;
}
public void setProperties(Properties properties) {
this.properties = properties;
}
private SingleTon(){

}
public static synchronized SingleTon getSingleTonObject(){
if(singleTon==null){
singleTon = new SingleTon();
Properties properties1 = new Properties();
try{
properties1.load(new FileInputStream("D:/propertiesFile.properties"));
singleTon.setProperties(properties1);
}catch(FileNotFoundException ex){
ex.printStackTrace();
}catch(IOException ioe){
ioe.printStackTrace();
}
return singleTon;
}
return singleTon;
}
public Object clone() throws CloneNotSupportedException{
throw new CloneNotSupportedException();
}

}