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
            private void start()
            {
                tvStoryText.setText("You decided to chose the beach, what activity do you want to do first?");

                ivStory.setImageResource(R.drawable.im_laborday_swimming);

                setAllBtnsVisible();
                btn1.setText("ride boat");
                btn2.setText("ride kayak");
                btn3.setVisibility(View.INVISIBLE);
                btn4.setVisibility(View.INVISIBLE);

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        rideBoat();
                    }
                });

                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        rideKayak();
                    }
                });
    }
        //start adventure here
        isWon = false;

        ivStory.setImageResource(R.drawable.im_laborday_title);
        playAudio(R.raw.audio_laborday_bass);

        tvStoryText.setText("You are in the Call of Duty life were you have to be productive and decide what you want to do, you either win or lose the game, where would you like to start off first?");

        setAllBtnsVisible();
        btn1.setText("Go to canada");
        btn2.setText("stay home");
        btn3.setText("road trip");
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go to goToCanada();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stayHome();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                roadTrip();
            }
        });
    }

    // GO TO CANADA

    private void goToCanada()
    {
        ivStory.setImageResource(R.drawable.im_laborday_beach);

        tvStoryText.setText("chose Canada and there are some things to do, what option would you like to go with and experience?");

        setAllBtnsVisible();
        btn1.setText("Go to the beach");
        btn2.setText("Go to the mountains");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToBeach();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMountains();
            }
        });
    }

    private void goToBeach()
    {
        tvStoryText.setText("You decided to chose the beach, what activity do you want to do first?");

        ivStory.setImageResource(R.drawable.im_laborday_swimming);

        setAllBtnsVisible();
        btn1.setText("ride boat");
        btn2.setText("ride kayak");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rideBoat();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rideKayak();
            }
        });
    }

    private void goToMountains()
    {
        System.out.println("\nYou decided to go to the mountains, what do you want to do?");
        System.out.println("1. Use a parachute\n2. Go biking");
        int choice = Util.enterInt(1,2);

        if(choice ==1)
        {
            useParachute();
        }
        else if(choice ==2)
        {
            goBiking();
        }
    }

    //____________________________________________________________________________________________________
    //ADD THIS
    private void useParachute()
    {
        Util.clearConsole();
        System.out.println("You had a fun time flying!");
        Util.clearConsole();
        win();
    }
    //____________________________________________________________________________________________________

    private void rideBoat()
    {
        Util.clearConsole();
        System.out.println("\nYou chose to ride a boat so then you arrived safely, congrats!");
        Util.pauseConsole();
        Util.clearConsole();
        win();
    }

    private void rideKayak()
    {
        Util.clearConsole();
        System.out.println("\nYou chose to ride a kayak so then you didn't end up to your destination, would you want go back?");
        System.out.println("1. Absolutely, yes!\n2. Nah, im fine here");
        int choice = Util.enterInt(1,2);

        if(choice ==1)
        {
            yes();
        }
        else if(choice ==2)
        {
            nah();
        }
    }

    private void yes()
    {
        Util.clearConsole();
        System.out.println("You want to go back so you'll get through to your destination!");
        Util.pauseConsole();
        Util.clearConsole();
        win();
    }
    private void nah()
    {
        Util.clearConsole();
        System.out.println("You chose to stay so you you didn't ended up at your destination");
        Util.pauseConsole();
        Util.clearConsole();
        lose();
    }

    private void usePrachute()
    {
        Util.clearConsole();
        System.out.println("\nYou had a fun time up above !");
        Util.pauseConsole();
        Util.clearConsole();
        win();
    }

    private void goBiking()
    {
        Util.clearConsole();
        System.out.println("\nYou think of riding a bike, what route would you go to?");
        System.out.println("1. Go right\n2. Go left");
        int choice = Util.enterInt(1,2);

        if(choice ==1)
        {
            goRight();
        }
        else if(choice ==2)
        {
            goLeft();
        }

    }

    private void goRight()
    {
        Util.clearConsole();
        System.out.println("\nYou went on wrong a route! want to take the other way, instead?");
        System.out.println("1. Stop biking and give up\n2. Go back and take other route");
        int choice = Util.enterInt(1,2);

        if(choice ==1)
        {
            giveUp();
        }
        else if(choice ==2)
        {
            goBack();
        }

    }

    private void goLeft()
    {
        Util.clearConsole();
        System.out.println("\nYou arrived at your destination, great!");
        Util.pauseConsole();
        Util.clearConsole();
        win();
    }

    private void giveUp()
    {
        Util.clearConsole();
        System.out.println("\nYou just gave up??! Well, you didn't end up to the place you want to go");
        Util.pauseConsole();
        Util.clearConsole();
        lose();
    }

    private void goBack()
    {
        Util.clearConsole();
        System.out.println("You went back on your way so then you end up at your destination, cool!");
        Util.pauseConsole();
        Util.clearConsole();
        win();

    }
    // STAY HOME

    private void stayHome()
    {
        Util.clearConsole();
        System.out.println("You decided to just stay at home, you gotta be productive!");
        System.out.println("1. Do nothing all day\n2. Do chores");
        int choice = Util.enterInt(1,2);

        if(choice ==1)
        {
            doNothing();
        }
        else if(choice ==2)
        {
            doChores();
        }
    }

    private void doNothing()
    {
        Util.clearConsole();
        System.out.println("You dont want to do nothing but u gotta do something. Decide now!");
        System.out.println("1.Start doing soemthing\n2. Stay lazy all day!");
        int choice = Util.enterInt(1,2);

        if(choice ==1)
        {
            doSomething();
        }
        else if(choice ==2)
        {
            stayLazy();
        }
    }

    private void doSomething()
    {
        Util.clearConsole();
        System.out.println("\nYou change your mind and you want to do something now. What to do first? ");
        System.out.println("1. Cook food\n2. Take a shower");
        int choice = Util.enterInt(1,2);

        if(choice ==1)
        {
            cookFood();
        }
        else if(choice ==2)
        {
            takeShower();
        }
    }

    private void stayLazy()
    {
        Util.clearConsole();
        System.out.println("\nYou got caught by your mom by being lazy, you're screwed!");
        Util.pauseConsole();
        Util.clearConsole();
        lose();
    }

    private void doChores()
    {
        Util.clearConsole();
        System.out.println("\nYou want to do chores, that's so nice of you! Now, you pick a chore that you want to do first.");
        System.out.println("1. Wash the dishes\n2. Fold the clothes");
        int choice = Util.enterInt(1,2);

        if(choice ==1)
        {
            washDishes();
        }
        else if(choice ==2)
        {
            foldClothes();
        }
    }

    private void washDishes()
    {
        Util.clearConsole();
        System.out.println("\nYou manage to wash the dishes, great job!");
        Util.pauseConsole();
        Util.clearConsole();
        win();
    }

    private void doLaundry()
    {
        Util.clearConsole();
        System.out.println("You wnat to do laundry, okay! Let's start doing this!");
        System.out.println("1. Fold the clothes\n2. Leave the clothes wrinkled.");
        int choice = Util.enterInt(1,2);

        if(choice ==1)
        {
            foldClothes();
        }
        else if(choice ==2)
        {
            clothesLeaveWrinkle();
        }
    }

    private void foldClothes()
    {
        Util.clearConsole();
        System.out.println("\nYou finish your chore!");
        Util.clearConsole();
        win();
    }

    private void clothesLeaveWrinkle()
    {
        Util.clearConsole();
        System.out.println("\nYou're being lazy!");
        Util.clearConsole();
        lose();
    }

    private void cookFood()
    {
        Util.clearConsole();
        System.out.println("\nYou chose to cook a food! Uhhh! I'm hungry!!");
        System.out.println("1. Eat the food you cooked\n2. Let the food get rotten");
        int choice = Util.enterInt(1,2);

        if(choice ==1)
        {
            eatFood();
        }
        else if(choice ==2)
        {
            foodRotten();
        }
    }

    private void eatFood()
    {
        Util.clearConsole();
        System.out.println("\nCongrats! You finished the food you cooked!");
        Util.clearConsole();
        win();

    }

    private void foodRotten()
    {
        Util.clearConsole();
        System.out.println("\nYou wasted so much food!!!");
        Util.pauseConsole();
        Util.clearConsole();
        lose();
    }

    private void takeShower()
    {
        Util.clearConsole();
        System.out.println("\nYou need to be productive first!");
        Util.pauseConsole();
        Util.clearConsole();
        lose();
    }

    //ROAD TRIP

    private void roadTrip()
    {
        Util.clearConsole();
        System.out.println("You chose to go on a roadtrip, let's go!!!");
        System.out.println("1. Traveled for 4 hours to Las Vegas\n2. Go to the iconic places");
        int choice = Util.enterInt(1,2);

        if(choice ==1)
        {
            traveledFourHours();
        }
        else if(choice ==2)
        {
            iconicPlaces();
        }
    }

    private void traveledFourHours()
    {
        Util.clearConsole();
        System.out.println("\nYou plan to go on a four hour roadtrip but you encounter problem! Oh no!");
        System.out.println("1. You ran out of gas\n2. Pull over on the side of the road");
        int choice = Util.enterInt(1,2);

        if(choice ==1)
        {
            ranOutGas();
        }
        else if(choice ==2)
        {
            pullOver();
        }
    }

    private void iconicPlaces()
    {
        Util.clearConsole();
        System.out.println("\nYou chose to go to the iconic places");
        System.out.println("1. Bad day it's raining\n2. You met Kendall Jenner on the same spot");
        int choice = Util.enterInt(1,2);

        if(choice ==1)
        {
            itsRaining();
        }
        else if(choice ==2)
        {
            metKendallJenner();
        }
    }

    private void ranOutGas()
    {
        Util.clearConsole();
        System.out.println("\nNow, you ran out of gas in the middle of the road, what would you do?");
        System.out.println("1. You want to rest\n2. Fuel the car right away");
        int choice = Util.enterInt(1,2);

        if(choice ==1)
        {
            wantToRest();
        }
        else if(choice ==2)
        {
            fuelCar();
        }
    }

    private void pullOver()
    {
        Util.clearConsole();
        System.out.println("You chose to pull Over, then a car hit you! You died! You are no longer alive");
        Util.pauseConsole();
        Util.clearConsole();
        lose();
    }

    private void itsRaining()
    {
        Util.clearConsole();
        System.out.println("It's raining outside, still want to go?");
        System.out.println("1. yes, i still want to go\n2. no, ill stay for the better");
        int choice = Util.enterInt(1,2);
        if(choice ==1)
        {
            wantToGo();
        }
        else if(choice ==2)
        {
            stay();
        }
    }

    private void metKendallJenner()
    {
        Util.clearConsole();
        System.out.println("Wow!! You met Kendall Jenner! What's one thing you want to ask for her?");
        System.out.println("1. Ask for a picture\n2. You're being shy");
        int choice = Util.enterInt(1,2);
        if (choice==1)
        {
            askPicture();
        }
        else if (choice ==2)
        {
            beingShy();
        }
    }

    private void wantToRest()
    {
        Util.clearConsole();
        System.out.println("You then chose to get a rest, you forgot about your destination, you're late!");
        Util.pauseConsole();
        Util.clearConsole();
        lose();
    }

    private void fuelCar()
    {
        Util.clearConsole();
        System.out.println("You chose to fuel the car first so then you can continue driving");
        Util.pauseConsole();
        Util.clearConsole();
        win();
    }

    private void wantToGo()
    {
        Util.clearConsole();
        System.out.println("It's raining cats and dogs! You need to stay home!");
        Util.pauseConsole();
        Util.clearConsole();
        lose();
    }

    private void stay()
    {
        Util.clearConsole();
        System.out.println("You chose to stay for the better, nice decision!");
        Util.pauseConsole();
        Util.clearConsole();
        win();
    }

    private void askPicture()
    {
        Util.clearConsole();
        System.out.println("You post it on social media, everyone sees you're famous now");
        Util.pauseConsole();
        Util.clearConsole();
        win();
    }

    private void beingShy()
    {
        Util.clearConsole();
        System.out.println("You insisted not to take picture, you lose the oppurtunity!!");
        Util.pauseConsole();
        Util.clearConsole();
        lose();
    }

    private void win()
    {
        Util.clearConsole();
        System.out.println("Congrats you win!");
        Util.pauseConsole();
        start();
    }

    private void lose()
    {
        Util.clearConsole();
        System.out.println("You lose");
        Util.pauseConsole();
        start();
    }
}
