package com.sanyok.myapplication2.app;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FragmentList extends Fragment {

    private RecyclerView recyclerView;
    private MyAdapterListSerials mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    private ArrayList<String> itemTextTitel;
    private ArrayList<String> itemTextSecond;
    private ArrayList<Integer> itemImageTitle;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_serial_layout, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_list);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(MainActivity.context);
        recyclerView.setLayoutManager(layoutManager);

        itemTextTitel = new ArrayList<String>();
        itemTextSecond = new ArrayList<String>();
        itemImageTitle = new ArrayList<Integer>();

        itemTextTitel.add("Стрела");
        itemTextTitel.add("Сотня");
        itemTextTitel.add("Готэм");
        itemTextTitel.add("Флэш");
        itemTextTitel.add("Константин");
        itemTextTitel.add("Марко Поло");
        itemTextTitel.add("Вечность");


        itemTextSecond.add("После кораблекрушения плейбой миллиардер Оливер Куин пропадает и считается погибшим в течение пяти лет,");
        itemTextSecond.add("События в сериале начинают разворачиваться по прошествии девяносто семи лет после того, как всю цивилизацию уничтожила страшная атомная война.");
        itemTextSecond.add("Детектив Джеймс Гордон и его напарник Харви Баллок приступили к работе в департаменте полиции Готэма. ");
        itemTextSecond.add("Когда Барри Аллен был маленьким, больше всего на свете ему хотелось быть супергероем — тем, кто превосходит лимиты человеческого организма и использует во благо ");
        itemTextSecond.add("Бывалый охотник на демонов и оккультист Джон Константин специализируется на задании жару аду. ");
        itemTextSecond.add("Сюжет сериала основан на приключениях знаменитого исследователя Марко Поло в Китае в 13-м веке. ");
        itemTextSecond.add("У доктора Генри Моргана, звездного судебно-медицинского эксперта Нью-Йорка, есть секрет. ");

        itemImageTitle.add(R.drawable.arr);
        itemImageTitle.add(R.drawable.thesto);
        itemImageTitle.add(R.drawable.got);
        itemImageTitle.add(R.drawable.fla);
        itemImageTitle.add(R.drawable.kon);
        itemImageTitle.add(R.drawable.mark);
        itemImageTitle.add(R.drawable.fore);


        itemTextTitel.add("Стрела");
        itemTextTitel.add("Сотня");
        itemTextTitel.add("Готэм");
        itemTextTitel.add("Флэш");
        itemTextTitel.add("Константин");
        itemTextTitel.add("Марко Поло");
        itemTextTitel.add("Вечность");


        itemTextSecond.add("После кораблекрушения плейбой миллиардер Оливер Куин пропадает и считается погибшим в течение пяти лет,");
        itemTextSecond.add("События в сериале начинают разворачиваться по прошествии девяносто семи лет после того, как всю цивилизацию уничтожила страшная атомная война.");
        itemTextSecond.add("Детектив Джеймс Гордон и его напарник Харви Баллок приступили к работе в департаменте полиции Готэма. ");
        itemTextSecond.add("Когда Барри Аллен был маленьким, больше всего на свете ему хотелось быть супергероем — тем, кто превосходит лимиты человеческого организма и использует во благо ");
        itemTextSecond.add("Бывалый охотник на демонов и оккультист Джон Константин специализируется на задании жару аду. ");
        itemTextSecond.add("Сюжет сериала основан на приключениях знаменитого исследователя Марко Поло в Китае в 13-м веке. ");
        itemTextSecond.add("У доктора Генри Моргана, звездного судебно-медицинского эксперта Нью-Йорка, есть секрет. ");

        itemImageTitle.add(R.drawable.arr);
        itemImageTitle.add(R.drawable.thesto);
        itemImageTitle.add(R.drawable.got);
        itemImageTitle.add(R.drawable.fla);
        itemImageTitle.add(R.drawable.kon);
        itemImageTitle.add(R.drawable.mark);
        itemImageTitle.add(R.drawable.fore);


        itemTextTitel.add("Стрела");
        itemTextTitel.add("Сотня");
        itemTextTitel.add("Готэм");
        itemTextTitel.add("Флэш");
        itemTextTitel.add("Константин");
        itemTextTitel.add("Марко Поло");
        itemTextTitel.add("Вечность");


        itemTextSecond.add("После кораблекрушения плейбой миллиардер Оливер Куин пропадает и считается погибшим в течение пяти лет,");
        itemTextSecond.add("События в сериале начинают разворачиваться по прошествии девяносто семи лет после того, как всю цивилизацию уничтожила страшная атомная война.");
        itemTextSecond.add("Детектив Джеймс Гордон и его напарник Харви Баллок приступили к работе в департаменте полиции Готэма. ");
        itemTextSecond.add("Когда Барри Аллен был маленьким, больше всего на свете ему хотелось быть супергероем — тем, кто превосходит лимиты человеческого организма и использует во благо ");
        itemTextSecond.add("Бывалый охотник на демонов и оккультист Джон Константин специализируется на задании жару аду. ");
        itemTextSecond.add("Сюжет сериала основан на приключениях знаменитого исследователя Марко Поло в Китае в 13-м веке. ");
        itemTextSecond.add("У доктора Генри Моргана, звездного судебно-медицинского эксперта Нью-Йорка, есть секрет. ");

        itemImageTitle.add(R.drawable.arr);
        itemImageTitle.add(R.drawable.thesto);
        itemImageTitle.add(R.drawable.got);
        itemImageTitle.add(R.drawable.fla);
        itemImageTitle.add(R.drawable.kon);
        itemImageTitle.add(R.drawable.mark);
        itemImageTitle.add(R.drawable.fore);


        itemTextTitel.add("Стрела");
        itemTextTitel.add("Сотня");
        itemTextTitel.add("Готэм");
        itemTextTitel.add("Флэш");
        itemTextTitel.add("Константин");
        itemTextTitel.add("Марко Поло");
        itemTextTitel.add("Вечность");


        itemTextSecond.add("После кораблекрушения плейбой миллиардер Оливер Куин пропадает и считается погибшим в течение пяти лет,");
        itemTextSecond.add("События в сериале начинают разворачиваться по прошествии девяносто семи лет после того, как всю цивилизацию уничтожила страшная атомная война.");
        itemTextSecond.add("Детектив Джеймс Гордон и его напарник Харви Баллок приступили к работе в департаменте полиции Готэма. ");
        itemTextSecond.add("Когда Барри Аллен был маленьким, больше всего на свете ему хотелось быть супергероем — тем, кто превосходит лимиты человеческого организма и использует во благо ");
        itemTextSecond.add("Бывалый охотник на демонов и оккультист Джон Константин специализируется на задании жару аду. ");
        itemTextSecond.add("Сюжет сериала основан на приключениях знаменитого исследователя Марко Поло в Китае в 13-м веке. ");
        itemTextSecond.add("У доктора Генри Моргана, звездного судебно-медицинского эксперта Нью-Йорка, есть секрет. ");

        itemImageTitle.add(R.drawable.arr);
        itemImageTitle.add(R.drawable.thesto);
        itemImageTitle.add(R.drawable.got);
        itemImageTitle.add(R.drawable.fla);
        itemImageTitle.add(R.drawable.kon);
        itemImageTitle.add(R.drawable.mark);
        itemImageTitle.add(R.drawable.fore);

        mAdapter = new MyAdapterListSerials(itemTextTitel, itemTextSecond, itemImageTitle);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.context));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        return view;
    }


}



