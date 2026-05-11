    package com.msa4java.edu.error;

    import java.io.FileWriter;
    import java.io.IOException;

    public class TryWithResource {
        public static void main(String[] args){
            //파일을 쓰기 모드로 불러오기
            try(FileWriter file = new FileWriter("text.txt");
         ) {
                file.write("안녕"); //파일에 해당 문자열 작성
             } catch (IOException e){
                 e.printStackTrace();
            }
        }
    }

        // FileWriter file = null;
//        try {
//            file = new FileWriter("text.txt");
//             file.write(("안녕"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        finally {
//            try {
//                file.close();
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//
//
//            }
//        }
//   }
//}