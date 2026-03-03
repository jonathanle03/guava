package com.google.common.testing;

import com.google.common.base.Supplier;

public class FakeIntSupplier implements Supplier<Integer> {
    public Integer get() {
        return 14;
    }

    public boolean equals(Integer object) {
        return true;
    }
}