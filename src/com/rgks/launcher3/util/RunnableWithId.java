/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.rgks.launcher3.util;

/**
 * A runnable with an id associated which is used for equality check.
 */
public abstract class RunnableWithId implements Runnable {

    public static final int RUNNABLE_ID_BIND_APPS = 1;
    public static final int RUNNABLE_ID_BIND_WIDGETS = 2;

    public final int id;

    public RunnableWithId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof RunnableWithId && ((RunnableWithId) obj).id == id;
    }
}
