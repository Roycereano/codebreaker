package edu.cnm.deepdive.codebreaker.controller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import edu.cnm.deepdive.codebreaker.viewmodel.ScoresViewModel;

//public class ScoresFragment extends Fragment {
//
//  private FragmentScoresBinding binding;
//
//  public View onCreateView(@NonNull LayoutInflater inflater,
//      ViewGroup container, Bundle saveInstanceState) {
//    binding = FragmentScoresBinding.inflate(inflater, container, false);
//    return binding.getRoot();
//  }
//
//  @Override
//  public void onViewCreated(@NonNull View view, @Nullable Bundle saveInstanceState) {
//    super.onViewCreated(view, saveInstanceState);
//    viewModel = new viewModelProvider(this).get(ScoresViewModel.class);
//    viewModel
//        .getGames()
//        .observe(getViewLifecycleOwner(), (games) -> {
//          GameSummaryAdapter adapter = new GameSummaryAdapter(getContext(), games);
//          binding.games.setAdapter(adapter);
//        });
//  }
//
//  @Override
//  public void onDestroyView() {
//    super.onDestroyView();
//    binding = null;
//  }
//}
