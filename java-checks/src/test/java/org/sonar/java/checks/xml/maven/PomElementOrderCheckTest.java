/*
 * SonarQube Java
 * Copyright (C) 2012-2018 SonarSource SA
 * mailto:info AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonar.java.checks.xml.maven;

import org.junit.Ignore;
import org.junit.Test;
import org.sonar.java.checks.verifier.PomCheckVerifier;

@Ignore
public class PomElementOrderCheckTest {

  @Test
  public void should_raise_issue_if_order_is_wrong() {
    PomCheckVerifier.verify("src/test/files/checks/xml/maven/PomElementOrderCheck.xml", new PomElementOrderCheck());
  }

  @Test
  public void should_raise_issue_with_location_only_between_first_and_last_wrong() {
    PomCheckVerifier.verify("src/test/files/checks/xml/maven/PomElementOrderCheck2.xml", new PomElementOrderCheck());
  }

  @Test
  public void should_not_raise_issue_if_order_is_correct() {
    PomCheckVerifier.verifyNoIssue("src/test/files/checks/xml/maven/PomElementOrderCheckCorrectOrder.xml", new PomElementOrderCheck());
  }

}
