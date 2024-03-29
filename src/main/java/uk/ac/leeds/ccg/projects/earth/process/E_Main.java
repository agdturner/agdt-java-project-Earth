/*
 * Copyright 2019 Centre for Computational Geography, University of Leeds.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.ac.leeds.ccg.projects.earth.process;

import java.io.IOException;
import uk.ac.leeds.ccg.generic.core.Generic_Environment;
import uk.ac.leeds.ccg.generic.io.Generic_Defaults;

/**
 * For running a model of Earth.
 *
 * @author Andy Turner
 * @version 1.0
 */
public class E_Main {

    public E_Main() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new E_Main().run();
    }

    public void run() {
        try {
            System.out.println("Hello World");
        } catch (Exception | Error e) {
            e.printStackTrace(System.err);
        }
    }

}
