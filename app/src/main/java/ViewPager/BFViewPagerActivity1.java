package ViewPager;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.alex.bfandroidstudying2.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 2017/12/25.
 */

public class BFViewPagerActivity1 extends Activity {

    private ViewPager vp1;
    private List<View> viewList;
    private PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager1);

        setupData();
        setupView();
    }

    private void setupView() {
        vp1 = (ViewPager)findViewById(R.id.vp1);
        vp1.setAdapter(pagerAdapter);
    }

    private void setupData() {
        // 展示资源View
        viewList = new ArrayList<View>();
        LayoutInflater inflater = getLayoutInflater();
        View view1 = inflater.inflate(R.layout.view_test1, null);
        View view2 = inflater.inflate(R.layout.view_test2, null);
        View view3 = inflater.inflate(R.layout.view_test3, null);
        viewList.add(view1);
        viewList.add(view2);
        viewList.add(view3);
        // Adapter
        pagerAdapter = new PagerAdapter() {
            @Override
            public int getCount() {
                return viewList.size();
            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
//                return false;
                return view == object;
            }

            @Override
            public Object instantiateItem(ViewGroup container, int position) {
//                return super.instantiateItem(container, position);
                container.addView(viewList.get(position));
                return viewList.get(position);
            }

            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
//                super.destroyItem(container, position, object);
                container.removeView(viewList.get(position));
            }
        };
    }
}
