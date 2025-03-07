package com.example.Liudiao.ui.home;

import android.Manifest;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelProviders;

import com.example.Liudiao.R;

public class HomeFragment extends Fragment {

    private AlertDialog.Builder builder;
    private ProgressDialog progressDialog;

    private SharedPreferences preferences;
    SharedPreferences.Editor editor;
    private int current_transid;
    private boolean isMe;
    private boolean hasJiben;
    private boolean hasJiankang;
    private boolean hasJingwai;
    private boolean hasJezhong;
    private boolean hasBingli;
    private boolean hasWeixian;

    private HomeViewModel homeViewModel;
    private LinearLayout gongneng1;
    private LinearLayout gongneng2;
    private LinearLayout gongneng3;
    private LinearLayout gongneng4;
    private LinearLayout gongneng5;
    private LinearLayout gongneng6;
    private LinearLayout gongneng7;
    private LinearLayout gongneng8;
    private LinearLayout gongneng9;
    private LinearLayout gongneng10;
    private LinearLayout gongneng11;
    private LinearLayout gongneng12;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        preferences = getActivity().getSharedPreferences("daiban", Context.MODE_PRIVATE);
        editor = preferences.edit();//获取编辑器
        current_transid = preferences.getInt("current_banliId", 0);
        isMe = preferences.getBoolean("isMe", false);
        hasJiben = preferences.getBoolean(current_transid + "hasJibenzhuangkuang", false);
        hasJiankang = preferences.getBoolean(current_transid + "hasJiankang", false);
        hasJingwai = preferences.getBoolean(current_transid + "hasJingwai", false);
        hasJezhong = preferences.getBoolean(current_transid + "hasJezhong", false);
        hasBingli = preferences.getBoolean(current_transid + "hasBingli", false);
        hasWeixian = preferences.getBoolean(current_transid + "hasWeixian", false);


        gongneng1 = (LinearLayout) root.findViewById(R.id.gongneng1);
        gongneng2 = (LinearLayout) root.findViewById(R.id.gongneng2);
        gongneng4 = (LinearLayout) root.findViewById(R.id.gongneng4);
        gongneng3 = (LinearLayout) root.findViewById(R.id.gongneng3);
        gongneng5 = (LinearLayout) root.findViewById(R.id.gongneng5);
        gongneng6 = (LinearLayout) root.findViewById(R.id.gongneng6);
        gongneng7 = (LinearLayout) root.findViewById(R.id.gongneng7);
        gongneng8 = (LinearLayout) root.findViewById(R.id.gongneng8);
        gongneng9 = (LinearLayout) root.findViewById(R.id.gongneng9);
        gongneng10 = (LinearLayout) root.findViewById(R.id.gongneng10);
        gongneng11 = (LinearLayout) root.findViewById(R.id.gongneng11);
        gongneng12 = (LinearLayout) root.findViewById(R.id.gongneng12);

        gongneng1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (current_transid != 100000 && current_transid != 0) {
                    Intent intent = new Intent(getActivity(), Jibenzhuangkuang.class);
                    startActivity(intent);
//                    if (isMe){
//                        Intent intent = new Intent(getActivity(),Jibenzhuangkuang.class);
//                        startActivity(intent);
//                    }else {
//                        if (!hasJiben){
//                            Intent intent = new Intent(getActivity(),Jibenzhuangkuang.class);
//                            startActivity(intent);
//                        }else {
//                            Toast.makeText(getActivity(),"该表单已提交！",Toast.LENGTH_SHORT).show();
//                        }
//                    }

                } else {
                    builder = new AlertDialog.Builder(getActivity()).setTitle("提醒")
                            .setMessage("当前未选择办理人，不能填写此项内容。请在个人主页进行流调办理并选择办理人之后再填写。").setPositiveButton("确定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    //ToDo: 你想做的事情
                                    dialogInterface.dismiss();
                                }
                            });
                    builder.create().show();
                }

            }
        });
        gongneng2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (current_transid != 100000 && current_transid != 0) {
                    Intent intent = new Intent(getActivity(), Familynew.class);
                    startActivity(intent);
                } else {
                    builder = new AlertDialog.Builder(getActivity()).setTitle("提醒")
                            .setMessage("当前未选择办理人，不能填写此项内容。请在个人主页进行流调办理并选择办理人之后再填写。").setPositiveButton("确定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    //ToDo: 你想做的事情
                                    dialogInterface.dismiss();
                                }
                            });
                    builder.create().show();
                }
            }
        });

        gongneng3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (current_transid != 100000 && current_transid != 0) {
                    Intent intent = new Intent(getActivity(), Jiankang.class);
                    startActivity(intent);
//                    if (isMe){
//                        Intent intent = new Intent(getActivity(),Jiankang.class);
//                        startActivity(intent);
//                    }else {
//                        if (!hasJiankang){
//                            Intent intent = new Intent(getActivity(),Jiankang.class);
//                            startActivity(intent);
//                        }else {
//                            Toast.makeText(getActivity(),"该表单已提交！",Toast.LENGTH_SHORT).show();
//                        }
//                    }
                } else {
                    builder = new AlertDialog.Builder(getActivity()).setTitle("提醒")
                            .setMessage("当前未选择办理人，不能填写此项内容。请在个人主页进行流调办理并选择办理人之后再填写。").setPositiveButton("确定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    //ToDo: 你想做的事情
                                    dialogInterface.dismiss();
                                }
                            });
                    builder.create().show();
                }
            }
        });


        gongneng4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (current_transid != 100000 && current_transid != 0) {
                    Intent intent = new Intent(getActivity(), Jingwai.class);
                    startActivity(intent);
//                    if (isMe){
//                        Intent intent = new Intent(getActivity(),Jingwai.class);
//                        startActivity(intent);
//                    }else {
//                        if (!hasJingwai){
//                            Intent intent = new Intent(getActivity(),Jingwai.class);
//                            startActivity(intent);
//                        }else {
//                            Toast.makeText(getActivity(),"该表单已提交！",Toast.LENGTH_SHORT).show();
//                        }
//                    }
                } else {
                    builder = new AlertDialog.Builder(getActivity()).setTitle("提醒")
                            .setMessage("当前未选择办理人，不能填写此项内容。请在个人主页进行流调办理并选择办理人之后再填写。").setPositiveButton("确定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    //ToDo: 你想做的事情
                                    dialogInterface.dismiss();
                                }
                            });
                    builder.create().show();
                }

            }
        });

        gongneng5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (current_transid != 100000 && current_transid != 0) {
                    Intent intent = new Intent(getActivity(), Jezhong.class);
                    startActivity(intent);
//                    if (isMe){
//                        Intent intent = new Intent(getActivity(),Jezhong.class);
//                        startActivity(intent);
//                    }else {
//                        if (!hasJezhong){
//                            Intent intent = new Intent(getActivity(),Jezhong.class);
//                            startActivity(intent);
//                        }else {
//                            Toast.makeText(getActivity(),"该表单已提交！",Toast.LENGTH_SHORT).show();
//                        }
//                    }
                } else {
                    builder = new AlertDialog.Builder(getActivity()).setTitle("提醒")
                            .setMessage("当前未选择办理人，不能填写此项内容。请在个人主页进行流调办理并选择办理人之后再填写。").setPositiveButton("确定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    //ToDo: 你想做的事情
                                    dialogInterface.dismiss();
                                }
                            });
                    builder.create().show();
                }
            }
        });
        gongneng6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (current_transid != 100000 && current_transid != 0) {
                    Intent intent = new Intent(getActivity(), Bingli.class);
                    startActivity(intent);
//                    if (isMe){
//                        Intent intent = new Intent(getActivity(),Bingli.class);
//                        startActivity(intent);
//                    }else {
//                        if (!hasBingli){
//                            Intent intent = new Intent(getActivity(),Bingli.class);
//                            startActivity(intent);
//                        }else {
//                            Toast.makeText(getActivity(),"该表单已提交！",Toast.LENGTH_SHORT).show();
//                        }
//                    }
                } else {
                    builder = new AlertDialog.Builder(getActivity()).setTitle("提醒")
                            .setMessage("当前未选择办理人，不能填写此项内容。请在个人主页进行流调办理并选择办理人之后再填写。").setPositiveButton("确定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    //ToDo: 你想做的事情
                                    dialogInterface.dismiss();
                                }
                            });
                    builder.create().show();
                }
            }
        });
        gongneng7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (current_transid != 100000 && current_transid != 0) {
                    Intent intent = new Intent(getActivity(), Weixian.class);
                    startActivity(intent);
//                    if (isMe){
//                        Intent intent = new Intent(getActivity(),Weixian.class);
//                        startActivity(intent);
//                    }else {
//                        if (!hasWeixian){
//                            Intent intent = new Intent(getActivity(),Weixian.class);
//                            startActivity(intent);
//                        }else {
//                            Toast.makeText(getActivity(),"该表单已提交！",Toast.LENGTH_SHORT).show();
//                        }
//                    }
                } else {
                    builder = new AlertDialog.Builder(getActivity()).setTitle("提醒")
                            .setMessage("当前未选择办理人，不能填写此项内容。请在个人主页进行流调办理并选择办理人之后再填写。").setPositiveButton("确定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    //ToDo: 你想做的事情
                                    dialogInterface.dismiss();
                                }
                            });
                    builder.create().show();
                }

            }
        });
        gongneng8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (current_transid != 100000 && current_transid != 0) {
                    Intent intent = new Intent(getActivity(), Mijie.class);
                    startActivity(intent);
//                    if (isMe){
//                        Intent intent = new Intent(getActivity(),Weixian.class);
//                        startActivity(intent);
//                    }else {
//                        if (!hasWeixian){
//                            Intent intent = new Intent(getActivity(),Weixian.class);
//                            startActivity(intent);
//                        }else {
//                            Toast.makeText(getActivity(),"该表单已提交！",Toast.LENGTH_SHORT).show();
//                        }
//                    }
                } else {
                    builder = new AlertDialog.Builder(getActivity()).setTitle("提醒")
                            .setMessage("当前未选择办理人，不能填写此项内容。请在个人主页进行流调办理并选择办理人之后再填写。").setPositiveButton("确定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    //ToDo: 你想做的事情
                                    dialogInterface.dismiss();
                                }
                            });
                    builder.create().show();
                }
            }
        });

        gongneng9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.WRITE_EXTERNAL_STORAGE)
                        != PackageManager.PERMISSION_GRANTED){
                    //第二步，如果没有授权，就授权
                    ActivityCompat.requestPermissions(getActivity(),new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},1);
                }else {
                    if (current_transid != 100000 && current_transid != 0) {
//                    new Handler().postDelayed(new Runnable() {
//                        @Override
//                        public void run() {
//                            Intent intent = new Intent(getActivity(),Baogaonew.class);
//                            startActivity(intent);
//                            Toast.makeText(getActivity(),"可选择性填写各模块完善报告！",Toast.LENGTH_SHORT).show();
//                        }
//                    }, 2000);
                        Intent intent = new Intent(getActivity(), Baogaonew.class);
                        startActivity(intent);
                        Toast.makeText(getActivity(), "可选择性填写各模块完善报告！", Toast.LENGTH_SHORT).show();
                    } else {
                        builder = new AlertDialog.Builder(getActivity()).setTitle("提醒")
                                .setMessage("当前未选择办理人，不能填写此项内容。请在个人主页进行流调办理并选择办理人之后再填写。").setPositiveButton("确定", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        //ToDo: 你想做的事情
                                        dialogInterface.dismiss();
                                    }
                                });
                        builder.create().show();
                    }
                }
            }
        });

//        gongneng9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                StringBuffer hasStr = new StringBuffer("");
//                hasStr.append("请填写并确认提交");
//                boolean hasJiben1 = preferences.getBoolean(current_transid+"hasJibenzhuangkuang",false);
//                boolean hasJezhong1 = preferences.getBoolean(current_transid+"hasJezhong",false);
//                boolean hasBingli1 = preferences.getBoolean(current_transid+"hasBingli",false);
//                if (ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.WRITE_EXTERNAL_STORAGE)
//                        != PackageManager.PERMISSION_GRANTED){
//                    //第二步，如果没有授权，就授权
//                    ActivityCompat.requestPermissions(getActivity(),new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},1);
//                }else {
//                    if (current_transid!=100000 && current_transid!=0){
//                        if (!hasJiben1 && !hasJezhong1 &&!hasBingli1){
//                            hasStr.append("基本状况、接种信息、病例发现模块！");
//                            //Toast.makeText(getActivity(),"请至少填写并确认提交基本状况、接种信息、病例发现模块！",Toast.LENGTH_LONG).show();
//                        }else {
//                            if (!hasJiben1){
//                                hasStr.append("基本状况 ");
//                            }
//                            if (!hasJezhong1){
//                                hasStr.append("接种信息 ");
//                            }
//                            if (!hasBingli1){
//                                hasStr.append("病例发现模块！");
//                            }
//                        }
//                        if (hasJiben1 && hasBingli1 && hasJezhong1){
//                            Intent intent = new Intent(getActivity(),Baogao.class);
//                            startActivity(intent);
//                            Toast.makeText(getActivity(),"可选择性填写各模块完善报告！",Toast.LENGTH_SHORT).show();
//                        }else {
//                            builder = new AlertDialog.Builder(getActivity()).setTitle("提醒")
//                                    .setMessage(hasStr).setPositiveButton("确定", new DialogInterface.OnClickListener() {
//                                        @Override
//                                        public void onClick(DialogInterface dialogInterface, int i) {
//                                            //ToDo: 你想做的事情
//                                            dialogInterface.dismiss();
//                                        }
//                                    });
//                            builder.create().show();
//                        }
//
//
//                    }else {
//                        builder = new AlertDialog.Builder(getActivity()).setTitle("提醒")
//                                .setMessage("当前未选择办理人，不能填写此项内容。请在个人主页进行流调办理并选择办理人之后再填写。").setPositiveButton("确定", new DialogInterface.OnClickListener() {
//                                    @Override
//                                    public void onClick(DialogInterface dialogInterface, int i) {
//                                        //ToDo: 你想做的事情
//                                        dialogInterface.dismiss();
//                                    }
//                                });
//                        builder.create().show();
//                    }
//                }
//
//
//
//            }
//        });
        gongneng10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "此功能暂未开放", Toast.LENGTH_SHORT).show();
            }
        });
        gongneng11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "此功能暂未开放", Toast.LENGTH_SHORT).show();
            }
        });
        return root;
    }


}