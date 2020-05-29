package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;
import javafx.stage.Stage;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;


public class Game {

    //FXML instance variables
    @FXML public GridPane GuessGrid;
    @FXML public GridPane matchGrid;
    public ImageView zz ,zz1;
    public ImageView oz, oz1;
    public ImageView tz, tz1;
    public ImageView thz, thz1;
    public ImageView zo, zo1;
    public ImageView oo, oo1;
    public ImageView to, to1;
    public ImageView tho, tho1;
    public ImageView zt, zt1;
    public ImageView ot, ot1;
    public ImageView tt;
    public ImageView tht;
    public ImageView zth;
    public ImageView oth;
    public ImageView tth;
    public ImageView thth;
    public ImageView zf;
    public ImageView of;
    public ImageView tf;
    public ImageView thf;

    public ImageView e1;
    public ImageView e2;
    public ImageView e3;
    public ImageView e4;
    public ImageView e5;


    public ImageView fz;
    public ImageView fo;
    public ImageView ft;
    public ImageView fth;
    public ImageView ff;
    public ImageView fiz;
    public ImageView fio;
    public ImageView fit;
    public ImageView fith;
    public ImageView fif;


    public Text clock = new Text();
    public Text Quote = new Text();



    ArrayList<Image> img = new ArrayList<Image>();
    ArrayList<ImageView> FXML = new ArrayList<ImageView>();
    ArrayList<Image> matched = new ArrayList<Image>();
    ArrayList<ImageView> matchlst = new ArrayList<ImageView>();

    Image imggrid[][] = new Image[5][6];
    Image black = new Image("Pictures/Black.png");

    //Instance  ariables
    private int first = 0;
    private int click1;

    private int click2;

    private int numMatch = 0;

    private Image _one;
    private Image _two;

    public Image view;

    public Timer t, time;

    public int seconds = 0;
    public int minutes = 0;
    public int supersec = 0;
    int r = 10;
    int g = 10;

    public static String realTime;

    public Image atlas = new Image("Pictures/Atlas.jpg");
    public Image Ben = new Image("Pictures/Ben.jpg");
    public Image concernedPipe = new Image("Pictures/concernedPipe.jpg");
    public  Image Ethan = new Image("Pictures/Ethan.jpg");
    public Image osacr = new Image("Pictures/oscar.jpg");
    public Image pipeBomb = new Image("Pictures/pipeBomb.jpg");
    public Image PipeStare = new Image("Pictures/PipeStare.jpg");
    public Image River = new Image("Pictures/River.jpg");
    public Image sebastian = new Image("Pictures/sebastian.jpeg");
    public Image trevor =  new Image("Pictures/trevor.png");
    public Image Joel =  new Image("Pictures/Joel.png");
    public Image Jonah =  new Image("Pictures/Jonah.jpg");
    public Image Jonathan =  new Image("Pictures/Jonathan.png");
    public Image Kelton =  new Image("Pictures/Kelton.jpg");
    public Image Alexis =  new Image("Pictures/Alexis.jpg");

    //instatiates the arraylists of images
    public void addimg(){
        img.add(atlas);
        img.add(Ben);
        img.add(concernedPipe);
        img.add(Ethan);
        img.add(osacr);
        img.add(pipeBomb);
        img.add(PipeStare);
        img.add(River);
        img.add(sebastian);
        img.add(trevor);

        img.add(Joel);
        img.add(Jonathan);
        img.add(Jonah);
        img.add(Kelton);
        img.add(Alexis);


    }
    //instantiates the arraylist of images
    public void addmatch(){
        matchlst.add(zz1);
        matchlst.add(oz1);
        matchlst.add(tz1);
        matchlst.add(thz1);
        matchlst.add(zo1);
        matchlst.add(e1);
        matchlst.add(e2);
        matchlst.add(e3);
        matchlst.add(oo1);
        matchlst.add(to1);
        matchlst.add(tho1);
        matchlst.add(zt1);
        matchlst.add(ot1);
        matchlst.add(e4);
        matchlst.add(e5);



    }

    //adds to the imageviews
    public void addFXML(){
        FXML.add(zz);
        FXML.add(oz);
        FXML.add(tz);
        FXML.add(thz);
        FXML.add(zo);
        FXML.add(oo);
        FXML.add(to);
        FXML.add(tho);
        FXML.add(zt);
        FXML.add(ot);
        FXML.add(tt);
        FXML.add(tht);
        FXML.add(zth);
        FXML.add(oth);
        FXML.add(tth);
        FXML.add(thth);
        FXML.add(zf);
        FXML.add(of);
        FXML.add(tf);
        FXML.add(thf);

        FXML.add(fz);
        FXML.add(fo);
        FXML.add(ft);
        FXML.add(fth);
        FXML.add(ff);
        FXML.add(fiz);
        FXML.add(fio);
        FXML.add(fit);
        FXML.add(fith);
        FXML.add(fif);




    }

    //"constructor"
    public void initialize() {
        Image black = new Image("Pictures/Black.png");
        clock.setText("0:00");
        addimg();
        addFXML();
        addmatch();
        System.out.println(img.size());
        System.out.println(FXML.size());
        System.out.println(img.get(1) == img.get(1));

        System.out.println(FXML);
        System.out.println(img);
        int cnt = 0;

        t = new Timer(1000, e -> {
            System.out.println("timer started");
            // TODO Auto-generated method stub
            for (ImageView imageView : FXML) {
                if (!matched.contains(imageView.getImage())) {
                    imageView.setImage(black);
                    imageView.setDisable(false);
                } else {
                    System.out.println("didint change");
                }
                first = 0;
                //System.out.println(FXML.size());
            }
            t.stop();
            System.out.println("timer ended");

        });

        time = new Timer(1000, e -> {
            System.out.println("2 started");
            // TODO Auto-generated method stub
            seconds++;
            supersec++;
           // System.out.println(supersec);
            if (seconds == 60) {
                minutes++;
                seconds = 0;
            }

           if(r<255){
               r = 140 + supersec*2;
               System.out.println("r:"+ r);
           }
           if(r>255){
               r= 255;
           }
           if(g>0){
                g = (int) (255 - supersec*1.5);
               System.out.println("g:"+ g);
           }
           if(g<0){
               g = 0;
           }

            clock.setFill(Color.rgb(r,g,0));
           realTime = String.format("%d:%02d", minutes, seconds);

            clock.setText(realTime);
        });


        for (int r = 0; r < imggrid.length; r++) {
            for (int c = 0; c < imggrid[0].length; c++) {
                view = img.get((int) (Math.random() * img.size()));
                System.out.println((int) (Math.random() * img.size()));
                //System.out.println(view);
                //FXML.get(cnt).setImage(view);
                FXML.get(cnt).setImage(black);
                img.remove(view);
                imggrid[r][c] = view;
                cnt++;
                if (img.size() == 0) {
                    addimg();
                }
            }

        }
        time.start();
    }


    //checks which square is clicked
    public void zzclicked(MouseEvent mouseEvent) throws IOException {
        if (mouseEvent.getSource() == zz) {
            whenClicked(0,0,0);
        }

        if (mouseEvent.getSource() == oz) {
            whenClicked(1,0,1);
        }

        if (mouseEvent.getSource() == tz) {
           whenClicked(2,0,2);
        }
        if (mouseEvent.getSource() == thz) {
            whenClicked(3,0,3);
        }
        if (mouseEvent.getSource() == zo) {
            whenClicked(4,1,0);
        }
        if (mouseEvent.getSource() == oo) {
            whenClicked(5,1,1);
        }
        if (mouseEvent.getSource() == to) {
            whenClicked(6,1,2);
        }
        if (mouseEvent.getSource() == tho) {
            whenClicked(7,1,3);
        }
        if (mouseEvent.getSource() == zt) {
            whenClicked(8,2,0);
        }
        if (mouseEvent.getSource() == ot) {
            whenClicked(9,2,1);
        }
        if (mouseEvent.getSource() == tt) {
            whenClicked(10,2,2);
        }
        if (mouseEvent.getSource() == tht) {
            whenClicked(11,2,3);
        }
        if (mouseEvent.getSource() == zth) {
            whenClicked(12,3,0);
        }
        if (mouseEvent.getSource() == oth) {
            whenClicked(13,3,1);
        }
        if (mouseEvent.getSource() == tth) {
            whenClicked(14,3,2);
        }
        if (mouseEvent.getSource() == thth) {
            whenClicked(15,3,3);
        }
        if (mouseEvent.getSource() == zf) {
            whenClicked(16,4,0);
        }
        if (mouseEvent.getSource() == of) {
            whenClicked(17,4,1);
        }
        if (mouseEvent.getSource() == tf) {
            whenClicked(18,4,2);
        }
        if (mouseEvent.getSource() == thf) {
            whenClicked(19,4,3);
        }
        if (mouseEvent.getSource() == fz) {
            whenClicked(20,0,4);
        }
        if (mouseEvent.getSource() == fo) {
            whenClicked(21,1,4);
        }
        if (mouseEvent.getSource() == ft) {
            whenClicked(22,2,4);
        }
        if (mouseEvent.getSource() == fth) {
            whenClicked(23,3,4);
        }
        if (mouseEvent.getSource() == ff) {
            whenClicked(24,4,4);
        }
        if (mouseEvent.getSource() == fiz) {
            whenClicked(25,0,5);
        }
        if (mouseEvent.getSource() == fio) {
            whenClicked(26,1,5);
        }
        if (mouseEvent.getSource() == fit) {
            whenClicked(27,2,5);
        }
        if (mouseEvent.getSource() == fith) {
            whenClicked(28,3,5);
        }
        if (mouseEvent.getSource() == fif) {
            whenClicked(29,4,5);
        }

        if(numMatch == 15){
            Parent three = FXMLLoader.load(getClass().getResource("/Files/End.fxml"));
            Scene sceneThree = new Scene(three);
            Stage window = (Stage)((Node)mouseEvent.getSource()).getScene().getWindow();
            window.setScene(sceneThree);
            window.centerOnScreen();
            window.show();
        }
    }



    public boolean check(){
        if (_one.equals(_two)){
            System.out.println("really true");
            System.out.println(_one);
            System.out.println(_two);
            matched.add(_one);
            matched.add(_two);


            _one = null;
            _two = null;
            return true;
        }
        else{
            System.out.println("really false");
            System.out.println(_one);
            System.out.println(_two);
            _one = null;
            _two = null;
            return false;
        }
    }
    //sees what squares need to be reverted back to black
    public void afadd(){
        for (int i = 0; i < FXML.size(); i++) {
            if (!matched.contains(FXML.get(i).getImage())) {
                FXML.get(i).setImage(black);
                FXML.get(i).setDisable(false);
            }
        }
    }

    //checks what will happen when an image is clicked
    public void whenClicked(int list, int r, int c){
        System.out.println(first);
        FXML.get(list).setImage(imggrid[r][c]);
        System.out.println(FXML.get(list).getImage());
        if (first == 0) {
            first = 1;
            _one = FXML.get(list).getImage();
            click1 = list;
            FXML.get(list).setDisable(true);
        } else if (first == 1) {
            click2 = list;
            _two = FXML.get(list).getImage();
            for(int i = 0; i<FXML.size(); i++){
                FXML.get(i).setDisable(true);
            }
            //t.start();
            if (check()) {
                t.stop();
                FXML.get(click1).setVisible(false);
                FXML.get(click2).setVisible(false);
                matchlst.get(numMatch).setImage(FXML.get(list).getImage());
                FXML.get(click1).setImage(imggrid[r][c]);
                FXML.get(click2).setImage(imggrid[r][c]);
                first = 0;
                FXML.get(list).setDisable(true);
                afadd();
                quote(FXML.get(list).getImage());
                numMatch++;
                if(numMatch == 15){
                    time.stop();
                }

            }
            else{
                t.start();
                System.out.println("false");
                first = 0;
                //t.stop();
            }
        }
    }

    //chooses a quote based on who is clicked
    public void quote(Image img){
        if(img.equals(Alexis)){
            Quote.setText("Alexis says: Im the Better Hartog");
        }
        if(img.equals(atlas)){
            Quote.setText("Atlas says: mmmm");
        }
        if(img.equals(Ben)){
            Quote.setText("Im Ben, and and definitley don't need to pay attention to rico");
        }
        if(img.equals(concernedPipe)){
            Quote.setText("Im pipe and you disgust me");
        }
        if(img.equals(Ethan)){
            Quote.setText("Im Ethan and sexy time");
        }
        if(img.equals(Joel)){
            Quote.setText("Im Joel, and I steal flash drives");
        }
        if(img.equals(Jonah)){
            Quote.setText("JEWS FOR PALESTINE");
        }
        if(img.equals(Jonathan)){
            Quote.setText("I eat the banana with the shell");
        }
        if(img.equals(Kelton)){
            Quote.setText("Im Kelton, and screw the imperial system");
        }
        if(img.equals(osacr)){
            Quote.setText("Im Oscar, and i dont know what I'm doing");
        }
        if(img.equals(pipeBomb)){
            Quote.setText("I'm pipe and mmmmm");
        }
        if(img.equals(PipeStare)){
            Quote.setText("I will stare into  your soul");
        }
        if(img.equals(River)){
            Quote.setText("Im River and I made the best robot cart of all time");
        }
        if(img.equals(sebastian)){
            Quote.setText("Im Sebastian, and screw Mr.Rico, I didnt need him");
        }
        if(img.equals(trevor)){
            Quote.setText("Im Trevor, and your tiny mortal minds will never understand me");
        }
    }

    //exit button
    public void exit(MouseEvent mouseEvent) {
        System.exit(0);
    }

    //replay button
    public void replay(){
        FXML.clear();
        img.clear();
        matchlst.clear();
        numMatch = 0;

    }

}
//[javafx.scene.image.Image@68799cf2, javafx.scene.image.Image@53868aa0, javafx.scene.image.Image@a0f548a, javafx.scene.image.Image@61bff076, javafx.scene.image.Image@45056ebf, javafx.scene.image.Image@22b13f35, javafx.scene.image.Image@52ea94ed, javafx.scene.image.Image@4c48f286, javafx.scene.image.Image@22561d26, javafx.scene.image.Image@9b5c6ce]