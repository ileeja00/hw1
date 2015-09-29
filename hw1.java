
class PhoneInfo{

private String name;
private String phone_number;
private String group;
private String birthday;

public PhoneInfo(String name, String phone_number, String group, String brithday){
 this.name = name;
 this.phone_number = phone_number;
 this.group = group;
 this.birthday = birthday;
}

public PhoneInfo(String name, String phone_number, String group){
 this.name = name;
 this.phone_number = phone_number;
 this.group = group;
 this.birthday = null;
}

public PhoneInfo(String name, String phone_number, String birthday){
 this.name = name;
 this.phone_number = phone_number;
 this.group = null;
 this.birthday = birthday;
}

public PhoneInfo(String name, String phone_number){
 this.name = name;
 this.phone_number = phone_number;
 this.group = null;
 this.birthday = null;
}

public void showInfo(){
 System.out.println(name+"\n"+phone_number);
 if(group!=null)
  System.out.println(group);
 if(birthday!=null)
  System.out.println(birthday);

 System.out.println();
 }
 }
