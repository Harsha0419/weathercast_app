// Generated by view binder compiler. Do not edit!
package com.github.bkhezry.weather.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import com.github.bkhezry.weather.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogSetAppidBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final AppCompatEditText apiKeyEditText;

  @NonNull
  public final AppCompatTextView messageTextView;

  @NonNull
  public final MaterialButton openOpenweatherButton;

  @NonNull
  public final MaterialButton storeButton;

  private DialogSetAppidBinding(@NonNull MaterialCardView rootView,
      @NonNull AppCompatEditText apiKeyEditText, @NonNull AppCompatTextView messageTextView,
      @NonNull MaterialButton openOpenweatherButton, @NonNull MaterialButton storeButton) {
    this.rootView = rootView;
    this.apiKeyEditText = apiKeyEditText;
    this.messageTextView = messageTextView;
    this.openOpenweatherButton = openOpenweatherButton;
    this.storeButton = storeButton;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogSetAppidBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogSetAppidBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_set_appid, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogSetAppidBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.api_key_edit_text;
      AppCompatEditText apiKeyEditText = rootView.findViewById(id);
      if (apiKeyEditText == null) {
        break missingId;
      }

      id = R.id.message_text_view;
      AppCompatTextView messageTextView = rootView.findViewById(id);
      if (messageTextView == null) {
        break missingId;
      }

      id = R.id.open_openweather_button;
      MaterialButton openOpenweatherButton = rootView.findViewById(id);
      if (openOpenweatherButton == null) {
        break missingId;
      }

      id = R.id.store_button;
      MaterialButton storeButton = rootView.findViewById(id);
      if (storeButton == null) {
        break missingId;
      }

      return new DialogSetAppidBinding((MaterialCardView) rootView, apiKeyEditText, messageTextView,
          openOpenweatherButton, storeButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
