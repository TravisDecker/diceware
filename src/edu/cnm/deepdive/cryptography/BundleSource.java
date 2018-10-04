package edu.cnm.deepdive.cryptography;

import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import javafx.scene.SnapshotParametersBuilder;

public class BundleSource implements WordSource {

  private ArrayList<String> words;


  public BundleSource(String basename) {
    ResourceBundle bundle = ResourceBundle.getBundle(basename);
    words = new ArrayList<>(
        bundle.keySet()
            .stream().map((k) -> bundle.getString(k))
            .collect(Collectors.toList())
        // "fluent style"
        // method.
        //method. ect.
    );
  }

  @Override
  public String get(int i) {
    return words.get(i);
  }

  @Override
  public int size() {
    return words.size();
  }
}
