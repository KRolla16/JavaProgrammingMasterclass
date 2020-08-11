package com.company;

import javax.swing.*;
import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {


        Album album = new Album("StormBringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Stormbringer2", 4.6);
        album.addSong("Stormbringer3", 3.54);
        album.addSong("Stormbringer4", 4.27);
        album.addSong("Stormbringer5", 4.2);
        album.addSong("Stormbringer6", 3.13);
        albums.add(album);
        album = new Album("For those about to rock","AC/DC");
        album.addSong("For those about to rock2", 4.6);
        album.addSong("For those about to rock3", 3.54);
        album.addSong("For those about to rock4", 2.22);
        album.addSong("For those about to rock5", 5.2);
        album.addSong("For those about to rock6", 5.32);
        album.addSong("For those about to rock7", 3.33);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlaylist("Stormbringer4",playList);
        albums.get(0).addToPlaylist("For those about to rock7",playList);
        albums.get(0).addToPlaylist("notExistingSong",playList);
        albums.get(0).addToPlaylist(9,playList);
        albums.get(1).addToPlaylist(8,playList);
        albums.get(1).addToPlaylist(3,playList);
        albums.get(1).addToPlaylist(2,playList);
        albums.get(1).addToPlaylist(24,playList);

        play(playList);

    }



    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0){
            System.out.println("No songs in play");
            return;
        }else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if (!forward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    }else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                break;
                case 2:
                    if (forward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }forward = false;
                        if (listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous().toString());
                        } else {
                            System.out.println("We are at the start of the playlist");
                            forward = true;
                        }
                    }
                break;
                case 3:
                    if (forward){
                        if (listIterator.hasPrevious()){
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        }else {
                            System.out.println("Se are at the start of the list");
                        }
                        if (listIterator.hasNext()){
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        }else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                   printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playList.size() >0){
                        listIterator.remove();
                        if (listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next());
                        }else if (listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }


    private static void printMenu(){
        System.out.println("Avalible actions:");
        System.out.println("0 - to quit\n"
        + "1 to play\n"
        + "2 to play previous song\n"
        + "3 to replay the current song\n"
        + "4 to list songs in the playlist\n"
        + "5 to print available actions\n"
        + "6 to delete current song from playlist");
    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("=================");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=================");
    }
}
