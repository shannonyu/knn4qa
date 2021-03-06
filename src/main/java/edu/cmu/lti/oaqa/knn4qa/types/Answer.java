

/* First created by JCasGen Mon Nov 30 13:17:14 EST 2015 */
package edu.cmu.lti.oaqa.knn4qa.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** One answer to a question
 * Updated by JCasGen Mon Nov 30 13:17:14 EST 2015
 * XML source: /home/leo/SourceTreeGit/leo_struct_ir_qa/src/main/resources/types/typeSystemDescriptor.xml
 * @generated */
public class Answer extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Answer.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Answer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Answer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Answer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Answer(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: id

  /** getter for id - gets A unique id that identifies both the answer and its respective question
   * @generated
   * @return value of the feature 
   */
  public String getId() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "edu.cmu.lti.oaqa.knn4qa.types.Answer");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Answer_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets A unique id that identifies both the answer and its respective question 
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(String v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "edu.cmu.lti.oaqa.knn4qa.types.Answer");
    jcasType.ll_cas.ll_setStringValue(addr, ((Answer_Type)jcasType).casFeatCode_id, v);}    
   
    
  //*--------------*
  //* Feature: uri

  /** getter for uri - gets A question id that is globally unique (e.g., it's a question number merged with the question uri).
   * @generated
   * @return value of the feature 
   */
  public String getUri() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_uri == null)
      jcasType.jcas.throwFeatMissing("uri", "edu.cmu.lti.oaqa.knn4qa.types.Answer");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Answer_Type)jcasType).casFeatCode_uri);}
    
  /** setter for uri - sets A question id that is globally unique (e.g., it's a question number merged with the question uri). 
   * @generated
   * @param v value to set into the feature 
   */
  public void setUri(String v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_uri == null)
      jcasType.jcas.throwFeatMissing("uri", "edu.cmu.lti.oaqa.knn4qa.types.Answer");
    jcasType.ll_cas.ll_setStringValue(addr, ((Answer_Type)jcasType).casFeatCode_uri, v);}    
   
    
  //*--------------*
  //* Feature: isBest

  /** getter for isBest - gets is the best answer?
   * @generated
   * @return value of the feature 
   */
  public boolean getIsBest() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_isBest == null)
      jcasType.jcas.throwFeatMissing("isBest", "edu.cmu.lti.oaqa.knn4qa.types.Answer");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_isBest);}
    
  /** setter for isBest - sets is the best answer? 
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsBest(boolean v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_isBest == null)
      jcasType.jcas.throwFeatMissing("isBest", "edu.cmu.lti.oaqa.knn4qa.types.Answer");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_isBest, v);}    
  }

    