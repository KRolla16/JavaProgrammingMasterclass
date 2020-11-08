package com.company;


public class Utilities {




public char[] everyNthChar(char[] sourceArray, int n){

    if (sourceArray == null || sourceArray.length <n){
        return sourceArray;
    }

    int returnetLenght = sourceArray.length / n;
    char[] result = new char[returnetLenght];
    int index = 0;

    for(int i = n-1; i< sourceArray.length; i +=n){
        result[index++] = sourceArray[i];
    }
return result;
}

// abcdeef -> acdef
//abcdedf d arent removed
public String removePairs(String source){
    if (source == null || source.length() <2){
        return  source;
    }
    StringBuilder sb = new StringBuilder();
    char[] string = source.toCharArray();

    for (int i=0; i <string.length -1; i++){
        System.out.println(string[i]);
        if (string[i] != string[i + 1]){
            sb.append(string[i]);
        }
    }
    //final char that is always safe
    System.out.println(string[string.length -1]);
    sb.append(string[string.length -1]);
    return sb.toString();
}

public int converter(int a, int b){
    return (a/b) + (a*30) - 2;
}


public String nullIfOddLength(String source){
    if (source.length() % 2 == 0){
        return source;
    }

    return null;
}
}
