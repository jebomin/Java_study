package chapter_13;

import java.io.File;

public class _05_FileAndFolder {
    public static void main(String[] args) {
        //String folder = "."; //.은 현재 위치 경로(상대경로)
        //String folder = "C:\\jebomin\\3학년 2학기\\java_workspace\\Java_study\\src\\chapter_13"; //절대경로
        String folder = "src/chapter_13"; //javaspace workspace에 상대경로로 설정
        File filesAndFolders = new File(folder);
        System.out.println("현재 폴더 경로 : "+filesAndFolders.getAbsolutePath());
        for (File file:filesAndFolders.listFiles()) {
            if(file.isFile()) {
                System.out.println("(파일) "+ file.getName());
            } else if (file.isDirectory()) {
                System.out.println("(폴더) "+file.getName());
            }
        }

    }
}
