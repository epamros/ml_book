package com.renoml.neuralnet;

import java.util.ArrayList;

/**
 * Created by RR on 19.10.2017.
 */
public class Neuron {
    protected ArrayList<Double> weight;
    private ArrayList<Double> input;
    private Double output;
    private Double outputBeforeActivation;
    private int numberOfInputs = 0;
    protected Double bias = 1.0;
    private IActivationFunction activationFunction;

    public Neuron (int numberOfInputs, IActivationFunction iaf){
        numberOfInputs = numberOfInputs;
        weight = new ArrayList<>(numberOfInputs + 1);
        input = new ArrayList<>(numberOfInputs);
        activationFunction = iaf;
    }

    public void init(){
        for(int i=0; i<numberOfInputs; i++){
            double newWeight = RandomNumberGenerator.GenerateNext();
            try{
                this.weight.set(i, newWeight);
            }
            catch (IndexOutOfBoundsException iobe){
                this.weight.add(newWeight);
            }
        }
    }

    public void calc(){
        outputBeforeActivation = 0.0;
        if(numberOfInputs>0){
            if(input != null && weight != null){
                for (int i=0; i<= numberOfInputs; i++){
                    outputBeforeActivation += (i==numberOfInputs?bias:input.get)
                }
            }
        }
    }
}
