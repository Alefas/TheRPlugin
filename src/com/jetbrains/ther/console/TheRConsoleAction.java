package com.jetbrains.ther.console;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.ExecutionHelper;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class TheRConsoleAction extends AnAction implements DumbAware {

  @Override
  public void actionPerformed(@NotNull final AnActionEvent event) {
    final Project project = CommonDataKeys.PROJECT.getData(event.getDataContext());
    if (project == null) return;

    try {
      TheRConsoleRunner runner = new TheRConsoleRunner(project, project.getBasePath());
      runner.initAndRun();
    }
    catch (ExecutionException ex) {
      ExecutionHelper.showErrors(project, Arrays.<Exception>asList(ex), "R Console", null);
    }
  }

  @Override
  public void update(@NotNull final AnActionEvent e) {
    final Project project = CommonDataKeys.PROJECT.getData(e.getDataContext());
    e.getPresentation().setVisible(project != null);
  }
}
