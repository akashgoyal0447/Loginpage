package com.tcs.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;




public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.ViewHolder> {

    DataRecieved mCallback;
    TextView mName;
    TextView mDept;
    TextView mPhone;

    public EmployeeAdapter(DataRecieved mCallback) {
        this.mCallback = mCallback;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
            mName=(TextView)itemView.findViewById(R.id.et_emp_name);
            mDept=(TextView)itemView.findViewById(R.id.et_emp_dept);
            mPhone=(TextView)itemView.findViewById(R.id.et_emp_phone);
        }
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.employee_layout,viewGroup,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        mName.setText(HomeScreen.sEmployeeList.get(i).getmName());
        mDept.setText(HomeScreen.sEmployeeList.get(i).getmDept());
        mPhone.setText(HomeScreen.sEmployeeList.get(i).getmPhone());
    }

    @Override
    public int getItemCount() {
        return HomeScreen.sEmployeeList.size();
    }


}
