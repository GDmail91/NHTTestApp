package org.nht.nhttestapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by 영수 on 2015-09-04.
 */
public class ButtonList extends Activity  {

    private ListView m_ListView;    // 버튼 리스트 띄우기 위한 뷰
    private ButtonAdapter m_ListAdapter;    // 버튼 리스트 가져올 어댑터

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_list);

        ImageButton addBtn = (ImageButton) findViewById(R.id.add_button);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ButtonList.this, AddActivity.class);
                startActivity(intent);
            }
        });

        // ListView 생성 및 어댑터 연결
        m_ListAdapter = new ButtonAdapter();

        m_ListView = (ListView) findViewById(R.id.list_view);
        m_ListView.setAdapter(m_ListAdapter);
        m_ListView.setOnItemClickListener(onClickListItem);

        // ListView에 아이템 추가
        m_ListAdapter.add("First Button");
        m_ListAdapter.add("Second Button");
        m_ListAdapter.add("Third Button");
        m_ListAdapter.add("Forth Button");
        m_ListAdapter.add("Fifth Button");
        m_ListAdapter.add("Sixth Button");
        m_ListAdapter.add("Seventh Button");
        m_ListAdapter.add("afsdfa Button");
        m_ListAdapter.add("asdfsdafe Button");
        m_ListAdapter.add("retert Button");
        m_ListAdapter.add("Fqer Button");
        m_ListAdapter.add("agsga Button");
        m_ListAdapter.add("qrqerqetsa Button");


    }

    // 아이템 터치 이벤트
    private AdapterView.OnItemClickListener onClickListItem = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            // 이벤트 발생 시 해당 아이템 위치의 텍스트를 출력
            Toast.makeText(getApplicationContext(), m_ListAdapter.getItem(position) + "\n 여기서 버튼 상세화면으로 넘어갑니다", Toast.LENGTH_SHORT).show();
        }
    };

}
