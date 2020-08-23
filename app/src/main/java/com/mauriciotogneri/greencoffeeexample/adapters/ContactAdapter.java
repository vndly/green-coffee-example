package com.mauriciotogneri.greencoffeeexample.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.mauriciotogneri.greencoffeeexample.R;
import com.mauriciotogneri.greencoffeeexample.model.Contact;

import java.util.List;

import androidx.annotation.NonNull;

public class ContactAdapter extends ArrayAdapter<Contact>
{
    private final LayoutInflater layoutInflater;

    public ContactAdapter(Context context, List<Contact> contacts)
    {
        super(context, R.layout.row_contact, contacts);

        this.layoutInflater = LayoutInflater.from(getContext());
    }

    @Override
    @NonNull
    public View getView(int position, View convertView, @NonNull ViewGroup parent)
    {
        View view = convertView;

        if (view == null)
        {
            view = layoutInflater.inflate(R.layout.row_contact, null, false);
        }

        Contact contact = getItem(position);

        if (contact != null)
        {
            TextView firstName = view.findViewById(R.id.contact_name);
            firstName.setText(contact.name());

            TextView age = view.findViewById(R.id.contact_age);
            age.setText(contact.age());

            TextView weight = view.findViewById(R.id.contact_weight);
            weight.setText(contact.weight());

            TextView married = view.findViewById(R.id.contact_married);
            married.setText(contact.married(getContext()));
        }

        return view;
    }
}