package org.nervos.molecule.generated.concrete;

import java.util.Objects;
import javax.annotation.Nonnull;
import org.nervos.molecule.generated.base.Array;
import org.nervos.molecule.generated.base.MoleculeException;

public final class Byte32 extends Array {
  public static Class ITEM_TYPE = byte.class;

  public static int ITEM_SIZE = 1;

  public static int ITEM_COUNT = 32;

  public static int SIZE = ITEM_SIZE * ITEM_COUNT;

  private byte[] items;

  private Byte32() {}

  @Nonnull
  public byte get(int i) {
    return items[i];
  }

  @Override
  public int getItemCount() {
    return ITEM_COUNT;
  }

  @Override
  public int getItemSize() {
    return ITEM_SIZE;
  }

  @Override
  public Class getItemType() {
    return ITEM_TYPE;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static Builder builder(@Nonnull byte[] buf) {
    return new Builder(buf);
  }

  public static final class Builder {
    private byte[] items;

    private Builder() {
      items = new byte[ITEM_COUNT];
    }

    private Builder(@Nonnull byte[] buf) {
      Objects.requireNonNull(buf);
      if (buf.length != SIZE) {
        throw new MoleculeException(SIZE, buf.length, Byte32.class);
      }
      items = new byte[ITEM_COUNT];
      items = buf;
    }

    public Builder set(int i, @Nonnull byte item) {
      Objects.requireNonNull(item);
      items[i] = item;
      return this;
    }

    public Byte32 build() {
      Byte32 a = new Byte32();
      a.buf = items;
      a.items = items;
      return a;
    }
  }
}
