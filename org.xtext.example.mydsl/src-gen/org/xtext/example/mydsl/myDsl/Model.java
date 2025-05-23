/**
 * generated by Xtext 2.36.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Model#getStory <em>Story</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Model#getPlayer <em>Player</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Model#getLocations <em>Locations</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Model#getNpc <em>Npc</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Model#getItem <em>Item</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Model#getAction <em>Action</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Model#getQuest <em>Quest</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Story</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Story</em>' containment reference.
   * @see #setStory(Story)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModel_Story()
   * @model containment="true"
   * @generated
   */
  Story getStory();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Model#getStory <em>Story</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Story</em>' containment reference.
   * @see #getStory()
   * @generated
   */
  void setStory(Story value);

  /**
   * Returns the value of the '<em><b>Player</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Player</em>' containment reference.
   * @see #setPlayer(Player)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModel_Player()
   * @model containment="true"
   * @generated
   */
  Player getPlayer();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Model#getPlayer <em>Player</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Player</em>' containment reference.
   * @see #getPlayer()
   * @generated
   */
  void setPlayer(Player value);

  /**
   * Returns the value of the '<em><b>Locations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Location}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Locations</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModel_Locations()
   * @model containment="true"
   * @generated
   */
  EList<Location> getLocations();

  /**
   * Returns the value of the '<em><b>Npc</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.NPC}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Npc</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModel_Npc()
   * @model containment="true"
   * @generated
   */
  EList<NPC> getNpc();

  /**
   * Returns the value of the '<em><b>Item</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Item}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Item</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModel_Item()
   * @model containment="true"
   * @generated
   */
  EList<Item> getItem();

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Action}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModel_Action()
   * @model containment="true"
   * @generated
   */
  EList<Action> getAction();

  /**
   * Returns the value of the '<em><b>Quest</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Quest}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quest</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModel_Quest()
   * @model containment="true"
   * @generated
   */
  EList<Quest> getQuest();

} // Model
