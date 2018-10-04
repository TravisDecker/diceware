package edu.cnm.deepdive.cryptography;

@FunctionalInterface
public interface ArtifactGenerator {

  public abstract String generate(int length);

}
