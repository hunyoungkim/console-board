package j.t1.control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


import j.t1.model.Command;

public interface Action {
ArrayList<Command> arrayList= new ArrayList<Command>();
InputStreamReader inputStreamReader =  new InputStreamReader(System.in);
BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

public void execute(BufferedReader bufferedReader) throws IOException;



}
