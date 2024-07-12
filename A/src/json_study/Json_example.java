package json_study;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Json_example {
    public static void main(String[] args) {
//        Json 문자열
        String jsonStr = "{\"id\":1,\"name\":\"ISC\"}";

//        Gson 객체 생성
        Gson gson = new Gson();

//        Json 문자열 -> Student 객체 (역직렬화)
        Student student = gson.fromJson(jsonStr,Student.class);
//        Student 객체 toString() 출력
        System.out.println(student); // Student [id=1, name =ISC]

//        Student 객체 -> Json 문자열 (직렬화)
        String studentJson = gson.toJson(student);
//        Json 문자열 출력
        System.out.println(studentJson); // {"id":1,"name":"ISC"}

//        Json 문자열 예쁘게 출력하기
        gson = new GsonBuilder().setPrettyPrinting().create();
        studentJson = gson.toJson(student);
        System.out.println(studentJson);
        /*
        {
          "id": 1,
          "name": "ISC"
        }
        */

    }

}
