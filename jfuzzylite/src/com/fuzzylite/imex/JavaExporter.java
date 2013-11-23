/*   Copyright 2013 Juan Rada-Vilela

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.fuzzylite.imex;

import com.fuzzylite.Engine;

/**
 *
 * @author jcrada
 */
public class JavaExporter extends Exporter {

    @Override
    public String toString(Engine engine) {
        String header = "";
        header += "//package name;\n\n";
        header += "import com.fuzzylite.*;\n";
        header += "import com.fuzzylite.defuzzifier.*;\n";
        header += "import com.fuzzylite.hedge.*;\n";
        header += "import com.fuzzylite.norm.s.*;\n";
        header += "import com.fuzzylite.norm.t.*;\n";
        header += "import com.fuzzylite.rule.*;\n";
        header += "import com.fuzzylite.term.*;\n";
        header += "import com.fuzzylite.variable.*;\n";
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}