/*
This Java source file was generated by test-to-java.xsl
and is a derived work from the source document.
The source document contained the following notice:



Copyright (c) 2001 World Wide Web Consortium,
(Massachusetts Institute of Technology, Institut National de
Recherche en Informatique et en Automatique, Keio University).  All
Rights Reserved.  This program is distributed under the W3C's Software
Intellectual Property License.  This program is distributed in the
hope that it will be useful, but WITHOUT ANY WARRANTY; without even
the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
PURPOSE.

See W3C License http://www.w3.org/Consortium/Legal/ for more details.


*/

package org.w3c.domts.level2.core;


import org.junit.Test;
import org.w3c.dom.*;

import static org.junit.Assert.assertEquals;
import static org.w3c.domts.DOMTest.load;


/**
 * The method getNamedItemNS retrieves a node specified by local name and namespace URI.
 * Create a new Element node and add 2 new attribute nodes having the same local name but different
 * namespace names and namespace prefixes to it.  Using the getNamedItemNS retreive the second attribute node.
 * Verify if the attr node has been retreived successfully by checking its nodeName atttribute.
 *
 * @see <a href="http://www.w3.org/TR/DOM-Level-2-Core/core#ID-getNamedItemNS">http://www.w3.org/TR/DOM-Level-2-Core/core#ID-getNamedItemNS</a>
 */
public class namednodemapgetnameditemns03 {
    @Test
    public void testRun() throws Throwable {
        Document doc;
        NamedNodeMap attributes;
        Node element;
        Attr attribute;
        Attr newAttr1;
        Attr newAttr2;
        Attr newAttribute;
        String attrName;
        doc = load("staffNS", false);
        element = doc.createElementNS("http://www.w3.org/DOM/Test", "root");
        newAttr1 = doc.createAttributeNS("http://www.w3.org/DOM/L1", "L1:att");
        newAttribute = ((Element) /*Node */element).setAttributeNodeNS(newAttr1);
        newAttr2 = doc.createAttributeNS("http://www.w3.org/DOM/L2", "L2:att");
        newAttribute = ((Element) /*Node */element).setAttributeNodeNS(newAttr2);
        attributes = element.getAttributes();
        attribute = (Attr) attributes.getNamedItemNS("http://www.w3.org/DOM/L2", "att");
        attrName = attribute.getNodeName();
        assertEquals("namednodemapgetnameditemns03", "L2:att", attrName);

    }

    /**
     * Gets URI that identifies the test
     *
     * @return uri identifier of test
     */
    public String getTargetURI() {
        return "http://www.w3.org/2001/DOM-Test-Suite/level2/core/namednodemapgetnameditemns03";
    }

}