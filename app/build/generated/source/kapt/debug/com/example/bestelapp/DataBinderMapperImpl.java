package com.example.bestelapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.bestelapp.databinding.FragmentConfirmationBindingImpl;
import com.example.bestelapp.databinding.FragmentOrderlistBindingImpl;
import com.example.bestelapp.databinding.FragmentOrdersuccesBindingImpl;
import com.example.bestelapp.databinding.FragmentQrBindingImpl;
import com.example.bestelapp.databinding.FragmentSponsorBindingImpl;
import com.example.bestelapp.databinding.FragmentTitleBindingImpl;
import com.example.bestelapp.databinding.ListitemOrderlistProductBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTCONFIRMATION = 1;

  private static final int LAYOUT_FRAGMENTORDERLIST = 2;

  private static final int LAYOUT_FRAGMENTORDERSUCCES = 3;

  private static final int LAYOUT_FRAGMENTQR = 4;

  private static final int LAYOUT_FRAGMENTSPONSOR = 5;

  private static final int LAYOUT_FRAGMENTTITLE = 6;

  private static final int LAYOUT_LISTITEMORDERLISTPRODUCT = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.bestelapp.R.layout.fragment_confirmation, LAYOUT_FRAGMENTCONFIRMATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.bestelapp.R.layout.fragment_orderlist, LAYOUT_FRAGMENTORDERLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.bestelapp.R.layout.fragment_ordersucces, LAYOUT_FRAGMENTORDERSUCCES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.bestelapp.R.layout.fragment_qr, LAYOUT_FRAGMENTQR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.bestelapp.R.layout.fragment_sponsor, LAYOUT_FRAGMENTSPONSOR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.bestelapp.R.layout.fragment_title, LAYOUT_FRAGMENTTITLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.bestelapp.R.layout.listitem_orderlist_product, LAYOUT_LISTITEMORDERLISTPRODUCT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTCONFIRMATION: {
          if ("layout/fragment_confirmation_0".equals(tag)) {
            return new FragmentConfirmationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_confirmation is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTORDERLIST: {
          if ("layout/fragment_orderlist_0".equals(tag)) {
            return new FragmentOrderlistBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_orderlist is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTORDERSUCCES: {
          if ("layout/fragment_ordersucces_0".equals(tag)) {
            return new FragmentOrdersuccesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_ordersucces is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTQR: {
          if ("layout/fragment_qr_0".equals(tag)) {
            return new FragmentQrBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_qr is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSPONSOR: {
          if ("layout/fragment_sponsor_0".equals(tag)) {
            return new FragmentSponsorBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_sponsor is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTITLE: {
          if ("layout/fragment_title_0".equals(tag)) {
            return new FragmentTitleBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_title is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMORDERLISTPRODUCT: {
          if ("layout/listitem_orderlist_product_0".equals(tag)) {
            return new ListitemOrderlistProductBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for listitem_orderlist_product is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(9);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "clickListener");
      sKeys.put(2, "confirmationViewModel");
      sKeys.put(3, "orderListViewModel");
      sKeys.put(4, "orderSuccesViewModel");
      sKeys.put(5, "product");
      sKeys.put(6, "qrViewModel");
      sKeys.put(7, "sponsorViewModel");
      sKeys.put(8, "titleViewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/fragment_confirmation_0", com.example.bestelapp.R.layout.fragment_confirmation);
      sKeys.put("layout/fragment_orderlist_0", com.example.bestelapp.R.layout.fragment_orderlist);
      sKeys.put("layout/fragment_ordersucces_0", com.example.bestelapp.R.layout.fragment_ordersucces);
      sKeys.put("layout/fragment_qr_0", com.example.bestelapp.R.layout.fragment_qr);
      sKeys.put("layout/fragment_sponsor_0", com.example.bestelapp.R.layout.fragment_sponsor);
      sKeys.put("layout/fragment_title_0", com.example.bestelapp.R.layout.fragment_title);
      sKeys.put("layout/listitem_orderlist_product_0", com.example.bestelapp.R.layout.listitem_orderlist_product);
    }
  }
}
