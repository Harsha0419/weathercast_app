// Generated by view binder compiler. Do not edit!
package com.github.bkhezry.weather.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import com.github.bkhezry.weather.R;
import com.miguelcatalan.materialsearchview.MaterialSearchView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ToolbarBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final AppCompatTextView cityNameTextView;

  @NonNull
  public final MaterialSearchView searchView;

  @NonNull
  public final Toolbar toolbar;

  private ToolbarBinding(@NonNull FrameLayout rootView, @NonNull AppCompatTextView cityNameTextView,
      @NonNull MaterialSearchView searchView, @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.cityNameTextView = cityNameTextView;
    this.searchView = searchView;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ToolbarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ToolbarBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.toolbar, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ToolbarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.city_name_text_view;
      AppCompatTextView cityNameTextView = rootView.findViewById(id);
      if (cityNameTextView == null) {
        break missingId;
      }

      id = R.id.search_view;
      MaterialSearchView searchView = rootView.findViewById(id);
      if (searchView == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = rootView.findViewById(id);
      if (toolbar == null) {
        break missingId;
      }

      return new ToolbarBinding((FrameLayout) rootView, cityNameTextView, searchView, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}