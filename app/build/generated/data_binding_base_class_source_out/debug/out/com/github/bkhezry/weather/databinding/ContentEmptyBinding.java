// Generated by view binder compiler. Do not edit!
package com.github.bkhezry.weather.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import com.github.bkhezry.weather.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ContentEmptyBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RelativeLayout emptyLayout;

  @NonNull
  public final AppCompatImageView noCityImageView;

  @NonNull
  public final AppCompatTextView searchTextView;

  private ContentEmptyBinding(@NonNull RelativeLayout rootView, @NonNull RelativeLayout emptyLayout,
      @NonNull AppCompatImageView noCityImageView, @NonNull AppCompatTextView searchTextView) {
    this.rootView = rootView;
    this.emptyLayout = emptyLayout;
    this.noCityImageView = noCityImageView;
    this.searchTextView = searchTextView;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ContentEmptyBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ContentEmptyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.content_empty, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ContentEmptyBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      RelativeLayout emptyLayout = (RelativeLayout) rootView;

      id = R.id.no_city_image_view;
      AppCompatImageView noCityImageView = rootView.findViewById(id);
      if (noCityImageView == null) {
        break missingId;
      }

      id = R.id.search_text_view;
      AppCompatTextView searchTextView = rootView.findViewById(id);
      if (searchTextView == null) {
        break missingId;
      }

      return new ContentEmptyBinding((RelativeLayout) rootView, emptyLayout, noCityImageView,
          searchTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
