package com.poly.polyapcsafinalproject23_24;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.poly.polyapcsafinalproject23_24.GameActivity;

import java.util.Scanner;

public class GameBellezaAvrille extends GameActivity {

private TextView tvTitle, tvSubtitle, tvStoryText;

private ImageView ivStory;

private Button btn1, btn2, btn3;

private boolean isWon;

private int numLIves;


@Override
protected void run() {
    setContentView(R.layout.activity_game_3_button);


    tvTitle = findViewById(R.id.tv_title_txt);
    tvSubtitle = findViewById(R.id.tv_subtitle);
    tvStoryText = findViewById(R.id.tv_story);
    ivStory = findViewById(R.id.iv_story);
    btn1 = findViewById(R.id.btn_1);
    btn2 = findViewById(R.id.btn_2);
    btn3 = findViewById(R.id.btn_3);


    tvTitle.setText("The Call of Duty ");
    tvSubtitle.setText("It's Winter Break! Where to relax?");

    numLives = 5;
    start();
}




private void setAllBtnsVisible()
{
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
}

public void start()
{
    isWon = false;
    ivStory.setImageResource(R.drawable.im_thecallofduty_title);

    tvStoryText.setText("It's Winter Break! Where to relax?");

    setAllBtnsVisible();
    btn1.setText("Go To Canada");
    btn2.setText("Stay Home");
    btn3.setText("Go on a roadtrip");

    btn1.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) { goToCanada(); }
    });

    btn2.setOnClickListener(new View. OnClickListener(){

        @Override
        public void onClick(View v) { stayHome();}
    });

    btn3.setOnClickListener(new View. OnClickListener(){

        @Override
        public void onClick(View v) { goOnARoadtrip();}
});

    private void goToCanada()
    {
       tvStoryText.setText("You chose Canada and there are some things to do, what option would you like to go with and experience?");

       ivStory.setImageResource(R.drawable.im_thecallofduty_canada);

       setAllBtnsVisible();
       btn1.setText("Go to the beach");
       btn2.setText("GO to the mountains");
       btn3.setText(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) { goToTheBeach(); }
        });

        btn2.setOnClickListener(new View. OnClickListener(){

            @Override
            public void onClick(View v) { goToTheMountains();}
        });

    }

    private void stayHome()
    {
        tvStoryText.setText("You decided to just stay at home, you gotta be productive!");

        ivStory.setImageResource(R.drawable.im_thecallofduty_home);

        setAllBtnsVisible();
        btn1.setText("Do nothing all day");
        btn2.setText("Do chores");
        btn3.setText(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) { doNothingAllDay(); }
        });

        btn2.setOnClickListener(new View. OnClickListener(){

            @Override
            public void onClick(View v) { doChores();}
        });

    }

    private void goOnARoadtrip()
    {
        tvStoryText.setText("You chose to go on a roadtrip, let's go!!!");

        ivStory.setImageResource(R.drawable.im_thecallofduty_roadtrip);

        setAllBtnsVisible();
        btn1.setText("Traveled for four hours to Las Vegas");
        btn2.setText("Go to the iconic places");
        btn3.setText(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) { doNOthingAllDay(); }
        });

        btn2.setOnClickListener(new View. OnClickListener(){

            @Override
            public void onClick(View v) { doChores();}
        });

    }


-----------------------------------------------------------------------------------------------------------------------

  /*
  TO DO
  1. Code the useParachute() method
  2. add in Util.pauseConsole() above Util.clearConsole() where needed
  3. code win() and lose()
  */


    //instance variables
    //   variables you plan to use throughout the adventure
    private Scanner scan;
    private int numLives;


    public void run()
    {
        //initialize number of lives
        numLives = 5;
        //create a scanner object for user input
        scan = new Scanner(System.in);

        //create a player object (optional)
        //player = new Player(...)

        //display project title and description
        Util.clearConsole();
        System.out.println("The Call of Duty");
        System.out.println("It's Winter Break! Where to relax?");
        Util.pauseConsole();
        Util.clearConsole();

        start();
    }
    private void start()
    {
        isWon = false;
        ivStory.setImageResource(R.drawable.im_thecallofduty_title);

        tvStoryText.setText("It's Winter Break! Where to relax?");

        setAllBtnsVisible();
        btn1.setText("Go To Canada");
        btn2.setText("Stay Home");
        btn3.setText("Go on a roadtrip");

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) { goToCanada(); }
        });

        btn2.setOnClickListener(new View. OnClickListener(){

            @Override
            public void onClick(View v) { stayHome();}
        });

        btn3.setOnClickListener(new View. OnClickListener(){

            @Override
            public void onClick(View v) { goOnARoadtrip();}
        });
    }

    // GO TO CANADA

    private void goToCanada()
    {
        tvStoryText.setText("You chose Canada and there are some things to do, what option would you like to go with and experience?");

        ivStory.setImageResource(R.drawable.im_thecallofduty_canada);

        setAllBtnsVisible();
        btn1.setText("Go to the beach");
        btn2.setText("GO to the mountains");
        btn3.setText(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) { goToTheBeach(); }
        });

        btn2.setOnClickListener(new View. OnClickListener(){

            @Override
            public void onClick(View v) { goToTheMountains();}
        });
    }

    private void goToBeach()
    {
        tvStoryText.setText("You decided to chose the beach, what activity do you want to do first?");

        ivStory.setImageResource(R.drawable.im_laborday_swimming);

        setAllBtnsVisible();
        btn1.setText("Ride a boat");
        btn2.setText("Ride kayak");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rideKayak();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rideBoat();
            }
        });
    }

    private void goToMountains()
    {
        tvStoryText.setText("You decided to go to the mountains, what do you want to do?");

        ivStory.setImageResource(R.drawable.im_laborday_swimming);

        setAllBtnsVisible();
        btn1.setText("Use a parachute");
        btn2.setText("go biking");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                useParachute();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBiking();
            }
        });
    }

    private void rideBoat()
    {
        isWon = true;
        tvStoryText.setText("You chose to ride a boat so then you arrived safely, congrats!");

        ivStory.setImageResource(R.drawable.im_laborday_lifeguard_shark);

        setAllBtnsVisible();
        btn1.setText("Congrats");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                win();
            }
        });
    }

    private void rideKayak()
    {
        isWon = true;
        tvStoryText.setText("You chose to ride a kayak so then you didn't end up to your destination, would you want go back?");

        ivStory.setImageResource(R.drawable.im_laborday_lifeguard_shark);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBack();
            }
        });

    private void yes()
    {
        isWon = true;
        tvStoryText.setText("You want to go back so you'll get through to your destination!");

        ivStory.setImageResource(R.drawable.im_laborday_lifeguard_shark);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                win();
            }
        });
    }
    private void nah()
    {
        tvStoryText.setText("You chose to stay so you you didn't ended up at your destination");

        ivStory.setImageResource(R.drawable.im_laborday_punch_shark);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lose();
            }
        });
    }

    private void useParachute()
    {
        tvStoryText.setText("You had a fun time up above !");

        ivStory.setImageResource(R.drawable.im_laborday_punch_shark);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                win();
            }
        });
    }

    private void goBiking()
    {
        tvStoryText.setText("nYou think of riding a bike, what route would you go to?");

        ivStory.setImageResource(R.drawable.im_laborday_swimming);

        setAllBtnsVisible();
        btn1.setText("Go right");
        btn2.setText("Go left");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goRight();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLeft();
            }
        });
    }

    private void goRight()
    {
        tvStoryText.setText("You went on wrong a route! want to take the other way, instead?");

        ivStory.setImageResource(R.drawable.im_laborday_swimming);

        setAllBtnsVisible();
        btn1.setText("Give Up");
        btn2.setText("Go back");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                giveUp();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBack();
            }
        });

    }

    private void goLeft()
    {
        isWon = true;
        tvStoryText.setText("You arrived at your destination, great!");

        ivStory.setImageResource(R.drawable.im_laborday_lifeguard_shark);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                win();
            }
        });
    }

    private void giveUp()
    {
        tvStoryText.setText("You just gave up??! Well, you didn't end up to the place you want to go");

        ivStory.setImageResource(R.drawable.im_laborday_punch_shark);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lose();
            }
        });
    }

    private void goBack()
    {
        tvStoryText.setText("You went back on your way so then you end up at your destination, cool!");

        ivStory.setImageResource(R.drawable.im_laborday_punch_shark);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                win();
            }
        });

    }
    // STAY HOME

    private void stayHome()
    {
        tvStoryText.setText("You decided to just stay at home, you gotta be productive!");

        ivStory.setImageResource(R.drawable.im_thecallofduty_home);

        setAllBtnsVisible();
        btn1.setText("Do nothing all day");
        btn2.setText("Do chores");
        btn3.setText(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) { doNothingAllDay(); }
        });

        btn2.setOnClickListener(new View. OnClickListener(){

            @Override
            public void onClick(View v) { doChores();}
        });
    }

    private void doNothing()
    {
        tvStoryText.setText("You dont want to do nothing but u gotta do something. Decide now!");

        ivStory.setImageResource(R.drawable.im_laborday_swimming);

        setAllBtnsVisible();
        btn1.setText("Start doing something");
        btn2.setText("Stay lazy all day");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doSomething();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stayLazy();
            }
        });
    }

    private void doSomething()
    {
        tvStoryText.setText("You change your mind and you want to do something now. What to do first? ");

        ivStory.setImageResource(R.drawable.im_laborday_swimming);

        setAllBtnsVisible();
        btn1.setText("Cook food");
        btn2.setText("Take a shower");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cookFood();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                takeShower();
            }
        });
    }

    private void stayLazy()
    {
        tvStoryText.setText("You got caught by your mom by being lazy, you're screwed!");

        ivStory.setImageResource(R.drawable.im_laborday_punch_shark);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lose();
            }
        });
    }

    private void doChores()
    {
        tvStoryText.setText("You want to do chores, that's so nice of you! Now, you pick a chore that you want to do first. ");

        ivStory.setImageResource(R.drawable.im_laborday_swimming);

        setAllBtnsVisible();
        btn1.setText("Wash the dishes");
        btn2.setText("Fold the clothes");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                washDishes();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                foldColthes();
            }
        });

    private void washDishes()
    {
        tvStoryText.setText("You manage to wash the dishes, great job!");

        ivStory.setImageResource(R.drawable.im_laborday_punch_shark);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                win();
            }
        });
    }

    private void doLaundry()
    {
        tvStoryText.setText("You wnat to do laundry, okay! Let's start doing this!");

        ivStory.setImageResource(R.drawable.im_laborday_swimming);

        setAllBtnsVisible();
        btn1.setText("Fold the clothes");
        btn2.setText("Leave the clothes wrinkled");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                foldClothes();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clothesleaveWrinkle();
            }
        });
    }

    private void foldClothes()
    {
        tvStoryText.setText("You finish your chore!");

        ivStory.setImageResource(R.drawable.im_laborday_punch_shark);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                win();
            }
        });
    }

    private void clothesLeaveWrinkle()
    {
        tvStoryText.setText("You finish your chore!");

        ivStory.setImageResource(R.drawable.im_laborday_punch_shark);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lose();
            }
        });
    }

    private void cookFood()
    {
        tvStoryText.setText("You chose to cook a food! Uhhh! I'm hungry!!");

        ivStory.setImageResource(R.drawable.im_laborday_swimming);

        setAllBtnsVisible();
        btn1.setText("Eat the food you cooked");
        btn2.setText("let the food get rotten");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eatFood();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                foodRotten();
            }
        });
    }

    private void eatFood()
    {
        tvStoryText.setText("Congrats! You finished the food you cooked!");

        ivStory.setImageResource(R.drawable.im_laborday_punch_shark);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                win();
            }
        });

    }

    private void foodRotten()
    {
        tvStoryText.setText("You wasted so much food!!!!");

        ivStory.setImageResource(R.drawable.im_laborday_punch_shark);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lose();
            }
        });
    }

    private void takeShower()
    {
        tvStoryText.setText("You need to be productive first!");

        ivStory.setImageResource(R.drawable.im_laborday_punch_shark);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lose();
            }
        });
    }

    //ROAD TRIP

    private void roadTrip()
    {
        tvStoryText.setText("You chose to go on a roadtrip, let's go!!!");

        ivStory.setImageResource(R.drawable.im_thecallofduty_roadtrip);

        setAllBtnsVisible();
        btn1.setText("Traveled for four hours to Las Vegas");
        btn2.setText("Go to the iconic places");
        btn3.setText(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) { doNOthingAllDay(); }
        });

        btn2.setOnClickListener(new View. OnClickListener(){

            @Override
            public void onClick(View v) { doChores();}
        });

    }

    private void traveledFourHours()
    {
        tvStoryText.setText("You chose to go on a roadtrip, let's go!!!");

        ivStory.setImageResource(R.drawable.im_thecallofduty_roadtrip);

        setAllBtnsVisible();
        btn1.setText("You ran out of gas");
        btn2.setText("Pull over on the side of the road");
        btn3.setText(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) { ranOutGas(); }
        });

        btn2.setOnClickListener(new View. OnClickListener(){

            @Override
            public void onClick(View v) { pullOver();}
        });
    }

    private void iconicPlaces()
    {
        tvStoryText.setText("You chose to go to the iconic places");

        ivStory.setImageResource(R.drawable.im_thecallofduty_roadtrip);

        setAllBtnsVisible();
        btn1.setText("bad day its raining");
        btn2.setText("You met Kendall Jenner on the same spot");
        btn3.setText(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) { itsraining(); }
        });

        btn2.setOnClickListener(new View. OnClickListener(){

            @Override
            public void onClick(View v) { metKendallJenner();}
        });
    }

    private void ranOutGas()
    {
        tvStoryText.setText("Now, you ran out of gas in the middle of the road, what would you do?");

        ivStory.setImageResource(R.drawable.im_thecallofduty_roadtrip);

        setAllBtnsVisible();
        btn1.setText("You want to rest");
        btn2.setText("Fuel the car right away");
        btn3.setText(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) { wantToRest(); }
        });

        btn2.setOnClickListener(new View. OnClickListener(){

            @Override
            public void onClick(View v) { fuelCar();}
        });
    }

    private void pullOver()
    {
        tvStoryText.setText("You chose to pull Over, then a car hit you! You died! You are no longer alive");

        ivStory.setImageResource(R.drawable.im_laborday_punch_shark);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lose();
            }
        });
    }

    private void itsRaining()
    {
        tvStoryText.setText("It's raining outside, still want to go?");

        ivStory.setImageResource(R.drawable.im_thecallofduty_roadtrip);

        setAllBtnsVisible();
        btn1.setText("yes, i still want to go");
        btn2.setText("no, ill stay for the better");
        btn3.setText(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) { wantToGo(); }
        });

        btn2.setOnClickListener(new View. OnClickListener(){

            @Override
            public void onClick(View v) { stay();}
        });
    }

    private void metKendallJenner()
    {
        tvStoryText.setText("Wow!! You met Kendall Jenner! What's one thing you want to ask for her?\"");

        ivStory.setImageResource(R.drawable.im_thecallofduty_roadtrip);

        setAllBtnsVisible();
        btn1.setText(" Ask for a picture");
        btn2.setText("You're being shy");
        btn3.setText(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) { askPicture(); }
        });

        btn2.setOnClickListener(new View. OnClickListener(){

            @Override
            public void onClick(View v) { beingShy();}
        });
    }

    private void wantToRest()
    {
        tvStoryText.setText("You then chose to get a rest, you forgot about your destination, you're late!");

        ivStory.setImageResource(R.drawable.im_laborday_punch_shark);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lose();
            }
        });
    }

    private void fuelCar()
    {
        tvStoryText.setText("You chose to fuel the car first so then you can continue driving");

        ivStory.setImageResource(R.drawable.im_laborday_punch_shark);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                win();
            }
        });
    }

    private void wantToGo()
    {
        tvStoryText.setText("It's raining cats and dogs! You need to stay home!");

        ivStory.setImageResource(R.drawable.im_laborday_punch_shark);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lose();
            }
        });
    }

    private void stay()
    {

        tvStoryText.setText("You chose to stay for the better, nice decision!");

        ivStory.setImageResource(R.drawable.im_laborday_punch_shark);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                win();
            }
        });
    }

    private void askPicture()
    {
        tvStoryText.setText("You post it on social media, everyone sees you're famous now!");

        ivStory.setImageResource(R.drawable.im_laborday_punch_shark);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                win();
            }
        });
    }

    private void beingShy()
    {
        tvStoryText.setText("It's raining cats and dogs! You need to stay home!");

        ivStory.setImageResource(R.drawable.im_laborday_punch_shark);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lose();
            }
        });
    }

    private void win()
    {
        tvStoryText.setText("It's raining cats and dogs! You need to stay home!");

        ivStory.setImageResource(R.drawable.im_laborday_punch_shark);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lose();
            }
        });
    }

    private void lose()
    {
        tvStoryText.setText("You post it on social media, everyone sees you're famous now!");

        ivStory.setImageResource(R.drawable.im_laborday_punch_shark);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                win();
            }
        });
    }
}
