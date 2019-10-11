package viewmodels;

import androidx.lifecycle.LiveData;

import java.util.List;

public interface IFilterViewModel<T> {

    LiveData<List<T>> getAll();

    void toggle(final T item);

    void setAll(final boolean insert);
}
