/*
 * this is not working. NullPointer exception at line 22
 */

package com.structural.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

interface SomeNeurons extends Iterable<Neuron>
{
  default void connectTo(SomeNeurons other)
  {
    if (this == other) return;

    for (Neuron from : this)
      for (Neuron to : other)
      {
        from.out.add(to);
        to.in.add(from);
      }
  }
}

class Neuron implements SomeNeurons
{
  public ArrayList<Neuron> in, out;

  @Override
  public Iterator<Neuron> iterator()
  {
    return Collections.singleton(this).iterator();
  }

  @Override
  public void forEach(Consumer<? super Neuron> action)
  {
    action.accept(this);
  }

  @Override
  public Spliterator<Neuron> spliterator()
  {
    return Collections.singleton(this).spliterator();
  }

//  public void connectTo(Neuron other)
//  {
//    out.add(other);
//    other.in.add(this);
//  }
}

class NeuronLayer extends ArrayList<Neuron>
  implements SomeNeurons
{
	private static final long serialVersionUID = 322580745647139964L;
}

public class NeuralNetworksDemo
{
  public static void main(String[] args)
  {
    Neuron neuron = new Neuron();
    Neuron neuron2 = new Neuron();
    NeuronLayer layer = new NeuronLayer();
    NeuronLayer layer2 = new NeuronLayer();

    neuron.connectTo(neuron2);
    neuron.connectTo(layer);
    layer.connectTo(neuron);
    layer.connectTo(layer2);
  }
}
