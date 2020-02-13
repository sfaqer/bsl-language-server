/*
 * This file is a part of BSL Language Server.
 *
 * Copyright © 2018-2020
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
package com.github._1c_syntax.bsl.languageserver.diagnostics;

import org.eclipse.lsp4j.Diagnostic;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.github._1c_syntax.bsl.languageserver.util.Assertions.assertThat;

class UsingExternalCodeToolsDiagnosticTest extends AbstractDiagnosticTest<UsingExternalCodeToolsDiagnostic> {
  UsingExternalCodeToolsDiagnosticTest() {
    super(UsingExternalCodeToolsDiagnostic.class);
  }

  @Test
  void test() {

    List<Diagnostic> diagnostics = getDiagnostics();

    assertThat(diagnostics).hasSize(7);
    assertThat(diagnostics, true)
      .hasRange(1, 19, 70)
      .hasRange(2, 16, 54)
      .hasRange(4, 16, 53)
      .hasRange(5, 12, 45)
      .hasRange(7, 17, 64)
      .hasRange(9, 30, 78)
      .hasRange(15, 4, 56)
    ;

  }
}
