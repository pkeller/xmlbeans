#/bin/sh

java -Xmx64m -Xbootclasspath/p:$XMLBEANS_PERFROOT/3rdparty/xerces/xerces-2_6_2/xml-apis.jar:$XMLBEANS_PERFROOT/3rdparty/xerces/xerces-2_6_2/xercesImpl.jar -classpath $XMLBEANS_PERFROOT/build:$XMLBEANS_PERFROOT/schema_build/jaxb-purchase-order.jar:$XMLBEANS_PERFROOT/schema_build/jaxb-primitives.jar:$XMLBEANS_PERFROOT/schema_build/jaxb-non-primitives.jar:$JAXB_LIBDIR/jaxb-libs.jar:$JAXB_LIBDIR/jaxb-impl.jar:$JAXB_LIBDIR/jaxb-api.jar:$JAXB_LIBDIR/relaxngDatatype.jar:$JAXB_LIBDIR/xsdlib.jar -DPERF_ROOT=$XMLBEANS_PERFROOT org.apache.xmlbeans.test.performance.jaxb.$* 
