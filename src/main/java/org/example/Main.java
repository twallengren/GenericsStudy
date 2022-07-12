package org.example;

import org.example.contravariance.consumable.Carrot;
import org.example.contravariance.consumable.EnergySource;
import org.example.contravariance.consumable.Vegetable;
import org.example.contravariance.consumer.CarrotConsumer;
import org.example.contravariance.consumer.EnergyConsumer;
import org.example.contravariance.consumer.VegetableConsumer;
import org.example.covariance.producer.Entertainer;
import org.example.covariance.producer.Musician;
import org.example.covariance.producer.Ozzy;
import org.example.covariance.producible.Entertainment;
import org.example.covariance.producible.Metal;
import org.example.covariance.producible.Music;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static Random rand = new Random();

    public static void main(String[] args) {
        covariance();
    }

    public static void covariance() {
        List<Entertainment> entertainmentList = new ArrayList<>();
        List<Music> musicList = new ArrayList<>();
        List<Metal> metalList = new ArrayList<>();

        Entertainer entertainer = new Entertainer();
        Entertainment entertainment = entertainer.produce();
        entertainmentList.add(entertainment);
        musicList.add(entertainment);
        metalList.add(entertainment);

        Musician musician = new Musician();
        Music music = musician.produce();
        entertainmentList.add(music);
        musicList.add(music);
        metalList.add(music);

        Ozzy ozzy = new Ozzy();
        Metal metal = ozzy.produce();
        entertainmentList.add(metal);
        musicList.add(metal);
        metalList.add(metal);
    }

    public static void contravariance() {
        EnergyConsumer energyConsumer = new EnergyConsumer();
        VegetableConsumer vegetableConsumer = new VegetableConsumer();
        CarrotConsumer carrotConsumer = new CarrotConsumer();

        List<EnergySource<?>> energySources = new ArrayList<>();

        EnergySource<?> energySource = new EnergySource<>();
        Vegetable<?> vegetable = new Vegetable<>();
        Carrot carrot = new Carrot();
    }
}