package Console;




import bridge.GdriveImplementation;

import java.util.Scanner;

public class ConsoleApp {
    public static void main(String[] args) {
        GdriveImplementation implementacija = new GdriveImplementation();
        Scanner input = new Scanner(System.in);
        while(true){
            String answer = input.nextLine();
            switch (answer){
                case "connect":
                    System.out.println("Enter the absolute path to the storage directory!");
                    implementacija.connectStorage(input.nextLine());
                    continue;
                case "disconnect":
                    implementacija.disconnectStorage();
                    continue;
                case "createUser":
                    implementacija.requestNewUser();
                    continue;
                case "createFile":
                    System.out.print("Enter the file name : ");
                    String name = input.nextLine();
                    System.out.print("Enter the file path to the location based off storage root : ");
                    String path = input.nextLine();
                    implementacija.createFile(name, path);
                    continue;
                case "createFolder":
                    System.out.print("Enter the folder name : ");
                    String name1 = input.nextLine();
                    System.out.print("Enter the file path to the location based off storage root : ");
                    String path1 = input.nextLine();
                    implementacija.createFolder( name1, path1);
                    continue;
                case "uploadFile":
                    System.out.print("Enter the absolute path to the source : ");
                    String name2 = input.nextLine();
                    System.out.print("Enter the file path to the destination based off storage root : ");
                    String path2 = input.nextLine();
                    implementacija.uploadFile( name2, path2);
                    continue;
                case "uploadFiles":
                    continue;
                case "deleteFile":
                    System.out.print("Enter the file path to the file based off storage root : ");
                    String path3 = input.nextLine();
                    implementacija.deleteFile(path3);
                    continue;
                case "deleteFolder":
                    System.out.print("Enter the file path to the folder based off storage root : ");
                    String path4 = input.nextLine();
                    implementacija.deleteFile(path4);
                    continue;
                case "listFiles":
                    System.out.print("Enter the file path to the folder based off storage root : ");
                    String path5 = input.nextLine();
                    implementacija.listFiles(path5);
                    continue;
                case "moveFile":
                    System.out.print("Enter the file path to the source folder based off storage root : ");
                    String path6 = input.nextLine();
                    System.out.print("Enter the file path to the dest folder based off storage root : ");
                    String path7 = input.nextLine();
                    implementacija.moveFile(path6, path7);
                    continue;
                case "downloadFolder":
                    System.out.print("Enter the file path to the source folder based off storage root : ");
                    String path8 = input.nextLine();
                    System.out.print("Enter the file path to the dest folder based off storage root : ");
                    String path9 = input.nextLine();
                    implementacija.downloadFolder(path8, path9);
                    continue;
                case "downloadFile":
                    System.out.print("Enter the file path to the source file based off storage root : ");
                    String path10 = input.nextLine();
                    System.out.print("Enter the absolute file path to the destination : ");
                    String path11 = input.nextLine();
                    implementacija.downloadFile(path10, path11);
                    continue;
                case "banExtension":
                    System.out.print("Enter the extension to ban : ");
                    String ext1 = input.nextLine();
                    implementacija.addExtBan(ext1);
                    continue;
                case "unbanExtension":
                    System.out.print("Enter the extension to unban : ");
                    String ext2 = input.nextLine();
                    implementacija.addExtBan(ext2);
                    continue;
                case "exit":
                    break;
                default:
                    System.out.print("Invalid command!");
                    System.out.println("Commands:");
                    System.out.println("connect");
                    System.out.println("disconnect");
                    System.out.println("createUser");
                    System.out.println("createFile");
                    System.out.println("createFolder");
                    System.out.println("uploadFile");
                    System.out.println("uploadFiles");
                    System.out.println("deleteFile");
                    System.out.println("deleteFolder");
                    System.out.println("moveFile");
                    System.out.println("listFiles");
                    System.out.println("moveFile");
                    System.out.println("downloadFolder");
                    System.out.println("downloadFile");
                    System.out.println("banExtension");
                    System.out.println("unbanExtension");
                    continue;
            }
            break;
        }
    }
}
