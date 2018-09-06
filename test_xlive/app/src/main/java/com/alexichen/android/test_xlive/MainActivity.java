package com.alexichen.android.test_xlive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //第一步
        Button Btn1 = (Button)findViewById(R.id.btn_initsdk);//获取按钮资源
        Btn1.setOnClickListener(new Button.OnClickListener(){//创建监听
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "请初始化SDK，以及workMode",
                        Toast.LENGTH_SHORT).show();
            }

        });

        // 第二步
        Button Btn2 = (Button)findViewById(R.id.btn_setuserparam);//获取按钮资源
        Btn2.setOnClickListener(new Button.OnClickListener(){//创建监听
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "设置用户参数",
                        Toast.LENGTH_SHORT).show();
            }

        });

        // 第三步
        Button Btn3 = (Button)findViewById(R.id.btn_loadspear);//获取按钮资源
        Btn3.setOnClickListener(new Button.OnClickListener(){//创建监听
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "加载spear配置",
                        Toast.LENGTH_SHORT).show();
            }

        });

        // 第四步
        Button Btn4 = (Button)findViewById(R.id.btn_enterroom);//获取按钮资源
                Btn4.setOnClickListener(new Button.OnClickListener(){//创建监听
                    public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "进房",
                        Toast.LENGTH_SHORT).show();
            }

        });


    }
}
