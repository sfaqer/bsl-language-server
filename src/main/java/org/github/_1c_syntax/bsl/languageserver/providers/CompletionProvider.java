/*
 * This file is a part of BSL Language Server.
 *
 * Copyright © 2018-2019
 * Alexey Sosnoviy <labotamy@gmail.com>, Nikita Gryzlov <nixel2007@gmail.com> and contributors
 *
 * SPDX-License-Identifier: LGPL-3.0-or-later
 *
 * BSL Language Server is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 *
 * BSL Language Server is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with BSL Language Server.
 */
package org.github._1c_syntax.bsl.languageserver.providers;

import org.eclipse.lsp4j.CompletionItem;
import org.eclipse.lsp4j.CompletionItemKind;
import org.eclipse.lsp4j.CompletionList;
import org.eclipse.lsp4j.CompletionParams;
import org.github._1c_syntax.bsl.languageserver.context.DocumentContext;
import org.github._1c_syntax.bsl.languageserver.context.MethodContext;

import java.util.ArrayList;
import java.util.List;

public final class CompletionProvider {

  public static CompletionList getCompletionList(CompletionParams position, DocumentContext documentContext) {

    List<CompletionItem> completionItems = new ArrayList<>();

    List<MethodContext> methods = documentContext.getMethods();
    methods.forEach(methodContext -> {
      CompletionItem completionItem = new CompletionItem(methodContext.getName());
      completionItem.setKind(CompletionItemKind.Method);

      completionItems.add(completionItem);
    });

    CompletionList completionList = new CompletionList();
    completionList.setItems(completionItems);

    return completionList;
  }

}
