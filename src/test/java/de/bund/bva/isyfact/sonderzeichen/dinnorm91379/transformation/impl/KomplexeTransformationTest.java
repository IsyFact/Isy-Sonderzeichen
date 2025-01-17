/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * The Federal Office of Administration (Bundesverwaltungsamt, BVA)
 * licenses this file to you under the Apache License, Version 2.0 (the
 * License). You may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package de.bund.bva.isyfact.sonderzeichen.dinnorm91379.transformation.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import de.bund.bva.isyfact.sonderzeichen.dinnorm91379.transformation.Transformator;

public class KomplexeTransformationTest {

    Transformator transformator;
    KomplexeTransformation komplexeTransformation;

    @Before
    public void setUp() {
        transformator = new IdentischerTransformator();
        komplexeTransformation = new KomplexeTransformation(transformator);
    }

    @Test
    public void testAddErsetzung() {
        komplexeTransformation.addErsetzung("Wagner", "Jens");
        assertEquals("Jens", komplexeTransformation.getErsetzung("Wagner", 0));

    }

    @Test
    public void testAddErsetzungMitRegeln() {
        String[] regeln = new String[] {"1", "2"};
        komplexeTransformation.addErsetzung("plis", "isy", regeln);
        assertEquals("isy", komplexeTransformation.getErsetzung("plis", 0));
    }
}
