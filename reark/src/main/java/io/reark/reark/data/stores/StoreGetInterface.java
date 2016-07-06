package io.reark.reark.data.stores;

import rx.Observable;

/**
 * Created by ttuo on 27/06/16.
 */
public interface StoreGetInterface<T, U> {
    Observable<U> getOne(T id);
    Observable<U> getStream(T id);
}
